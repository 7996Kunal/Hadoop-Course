import java.security.PrivilegedExceptionAction;

import org.apache.hadoop.conf.*;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FileStatus;

public class A4 {

    public static void main(String args[]) {

        try {
            UserGroupInformation ugi
                = UserGroupInformation.createRemoteUser("hbase");

            ugi.doAs(new PrivilegedExceptionAction<Void>() {

                public Void run() throws Exception {

                    Configuration conf = new Configuration();
                    conf.set("fs.defaultFS", "hdfs://1.2.3.4:8020/user/Administrator");
                    conf.set("hadoop.job.ugi", "hbase");

                    FileSystem fs = FileSystem.get(conf);

                    fs.createNewFile(new Path("/user/Administrator/test"));

                    FileStatus[] status = fs.listStatus(new Path("/user/Administrator"));
                    for(int i=0;i<status.length;i++){
                        System.out.println(status[i].getPath());
                    }
                    return null;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}