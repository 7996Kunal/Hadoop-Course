
import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SortName 
{
    public static class MyMapper extends Mapper<Object,Text,Text,DoubleWritable>
    {

        @Override
        protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
            String line=value.toString();
            String[] details=line.split(",");
            String name=details[1];
            double salary=0;
            try{
                salary=Double.parseDouble(details[7]);
                
            }catch(Exception ee){}
            context.write(new Text(name),new DoubleWritable(salary));
        }
        
    }
    public static class MyReducer extends Reducer<Text,DoubleWritable,Text,DoubleWritable>
    {

        @Override
        protected void reduce(Text key, Iterable<DoubleWritable> values, Context context) throws IOException, InterruptedException {
            Iterator<DoubleWritable> dd=values.iterator();
            while(dd.hasNext())
            {
                context.write(key,dd.next());
            }            
        }
        
    }
    public static void main(String[] args) throws Exception
    {
        Configuration conf=new Configuration();
        Job job=Job.getInstance(conf,"SortByName");
        job.setMapperClass(MyMapper.class);
        job.setCombinerClass(MyReducer.class);
        job.setReducerClass(MyReducer.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(DoubleWritable.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(DoubleWritable.class);
        job.setJarByClass(SortName.class);
        FileInputFormat.setInputPaths(job,new Path(args[0]));
        FileOutputFormat.setOutputPath(job,new Path(args[1]));
        System.exit(job.waitForCompletion(true)?0:1);
    }
}
