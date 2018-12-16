import java.io.*;
class S15
{
	public static void main(String[] ar)
	{
		//File f1=new File("d:/HadoopBatch/S1.java");
		File f1=new File("S1.java");
		File f2=new File("d:/HadoopBatch/S31.java");
		File f3=new File("d:/HadoopBatch");
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		System.out.println();
		System.out.println(f1.isDirectory());
		System.out.println(f2.isDirectory());
		System.out.println(f3.isDirectory());
		System.out.println();
		System.out.println(f1.isFile());
		System.out.println(f2.isFile());
		System.out.println(f3.isFile());
		System.out.println();
		System.out.println(f1.length());
		System.out.println(f2.length());
		System.out.println(f3.length());
		System.out.println();
		System.out.println(f1.getParent());
		System.out.println(f2.getParent());
		System.out.println(f3.getParent());
		System.out.println();
		System.out.println(f1.getAbsolutePath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f3.getAbsolutePath());
	}
}