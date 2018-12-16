import java.io.*;
class S19
{
	public static void main(String[] ar)
	{
		try{
			//FileInputStream fin=new FileInputStream("S1.java");
			FileInputStream fin=new FileInputStream("d:/web/r1.jpg");
			int a1=fin.read();
			while(a1>=0)
			{
				System.out.print((char)a1);
				a1=fin.read();
			}
			fin.close();
		}catch(Exception ee){}
	}
}