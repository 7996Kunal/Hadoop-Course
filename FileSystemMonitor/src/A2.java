
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
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
public class A2 
{
    public static void main(String[] args) {
        try{
            Configuration configuration =new Configuration();
            FileSystem hdfs=FileSystem.get(configuration);
            Path p=new Path("/user/Administrator/a3.txt");
            FSDataInputStream din=hdfs.open(p);
            InputStreamReader inr=new InputStreamReader(din);
            BufferedReader bfr=new BufferedReader(inr);
            String s=bfr.readLine();
            while(s!=null)
            {
                System.out.println(s);
                s=bfr.readLine();
            }            
        }catch(Exception ee){System.out.println(ee);}
    }
}
