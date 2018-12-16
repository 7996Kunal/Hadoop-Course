
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Map.Entry;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.aggregate.ValueAggregatorBaseDescriptor;
import org.apache.hadoop.mapreduce.lib.aggregate.ValueAggregatorJob;

/**
 * This is an example Aggregated Hadoop Map/Reduce application. It reads the
 * text input files, breaks each line into words and counts them. The output is
 * a locally sorted list of words and the count of how often they occurred.
 *
 * To run: bin/hadoop jar hadoop-*-examples.jar aggregatewordcount
 * <i>in-dir</i> <i>out-dir</i> <i>numOfReducers</i> textinputformat
 *
 */
public class AggregateWordCount {

  public static class WordCountPlugInClass extends
      ValueAggregatorBaseDescriptor {
    @Override
    public ArrayList<Entry<Text, Text>> generateKeyValPairs(Object key,
                                                            Object val) {
      String countType = LONG_VALUE_SUM;
      ArrayList<Entry<Text, Text>> retv = new ArrayList<Entry<Text, Text>>();
      String line = val.toString();
      StringTokenizer itr = new StringTokenizer(line);
      while (itr.hasMoreTokens()) {
        Entry<Text, Text> e = generateEntry(countType, itr.nextToken(), ONE);
        if (e != null) {
          retv.add(e);
        }
      }
      return retv;
    }
  }

  /**
   * The main driver for word count map/reduce program. Invoke this method to
   * submit the map/reduce job.
   *
   * @throws IOException
   *           When there is communication problems with the job tracker.
   */
  @SuppressWarnings("unchecked")
  public static void main(String[] args)
    throws IOException, InterruptedException, ClassNotFoundException  {
    Job job = ValueAggregatorJob.createValueAggregatorJob(args
        , new Class[] {WordCountPlugInClass.class});
    job.setJarByClass(AggregateWordCount.class);
    int ret = job.waitForCompletion(true) ? 0 : 1;
    System.exit(ret);
  }

}
