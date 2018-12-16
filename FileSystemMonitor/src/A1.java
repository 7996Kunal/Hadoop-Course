
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FileUtil;
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
public class A1 
{
    public static void main(String[] args) {
        try{
            Configuration configuration =new Configuration();
            FileSystem hdfs=FileSystem.get(configuration);
            
            FileStatus[] fileStatus = hdfs.listStatus(new Path("/user/Administrator"));            
            Path[] paths = FileUtil.stat2Paths(fileStatus);
            System.out.println("***** Contents of the Directory *****");
            for(Path path : paths)
            {
                System.out.println(path);
            }
            
        }catch(Exception ee){System.out.println(ee);}
    }
}
