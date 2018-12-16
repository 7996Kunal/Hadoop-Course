import java.io.*;
class S16
{
	public static void main(String[] ar)
	{
		File f3=new File(ar[0]);
		File[] arr=f3.listFiles();
		for(File f:arr)
		{
			String s=f.getAbsolutePath();
			String t="<DIR>";
			if(f.isFile()) t="<FILE>";
			System.out.println(s+"\t"+t);
		}
	}
}