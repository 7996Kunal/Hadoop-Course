import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.aggregate.ValueAggregatorBaseDescriptor;
import org.apache.hadoop.mapreduce.lib.aggregate.ValueAggregatorJob;

/**
 * This is an example Aggregated Hadoop Map/Reduce application. Computes the
 * histogram of the words in the input texts.
 *
 * To run: bin/hadoop jar hadoop-*-examples.jar aggregatewordhist <i>in-dir</i>
 * <i>out-dir</i> <i>numOfReducers</i> textinputformat
 *
 */
public class AggregateWordHistogram {

  public static class AggregateWordHistogramPlugin
    extends ValueAggregatorBaseDescriptor {

    /**
     * Parse the given value, generate an aggregation-id/value pair per word.
     * The ID is of type VALUE_HISTOGRAM, with WORD_HISTOGRAM as the real id.
     * The value is WORD\t1.
     *
     * @return a list of the generated pairs.
     */
    @Override
    public ArrayList<Entry<Text, Text>> generateKeyValPairs(Object key,
                                          Object val) {
      String words[] = val.toString().split(" |\t");
      ArrayList<Entry<Text, Text>> retv = new ArrayList<Entry<Text, Text>>();
      for (int i = 0; i < words.length; i++) {
        Text valCount = new Text(words[i] + "\t" + "1");
        Entry<Text, Text> en = generateEntry(VALUE_HISTOGRAM, "WORD_HISTOGRAM",
                                 valCount);
        retv.add(en);
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
        , new Class[] {AggregateWordHistogramPlugin.class});
    job.setJarByClass(AggregateWordCount.class);
    int ret = job.waitForCompletion(true) ? 0 : 1;
    System.exit(ret);
  }
}
