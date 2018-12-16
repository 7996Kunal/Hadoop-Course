
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class A3
{
    public static void main(String[] args) {
        try{
            Configuration configuration =new Configuration();
            FileSystem hdfs=FileSystem.get(configuration);
            Path p=new Path("/user/Administrator/abc1/part-r-00000");
            FSDataInputStream din=hdfs.open(p);
            InputStreamReader inr=new InputStreamReader(din);
            BufferedReader bfr=new BufferedReader(inr);
            String s=bfr.readLine();
            int sum=0;
            while(s!=null)
            {
                System.out.println(s);
                String[] arr=s.split("\t");
                sum=sum+Integer.parseInt(arr[1]);
                s=bfr.readLine();                
            }            
            din.close();
            FSDataOutputStream dout=hdfs.append(p);
            dout.writeUTF("\nTotal Words "+sum);
            dout.close();
            System.out.println("done");
        }catch(Exception ee){System.out.println(ee);}
    }
}
