import java.io.*;
public class file
{
	public static void main(String[] ar)
	{
		File file = new File("D:\\jsdk2.0");
		fun(file);
	}
        static void fun(File directory){
            File[] subFiles = directory.listFiles();
            for(File f:subFiles){
                if(f.isFile()){
                    System.out.println(f.getName());
                }else{
                    fun(f.getAbsoluteFile());
                }
            }
        }
}