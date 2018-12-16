import java.io.*;
class p18
{
	public static void main(String[] ar)
	{
		try{
			//FileInputStream fin=new FileInputStream("t1.txt");
			FileInputStream fin=new FileInputStream("d:/web/r4.jpg");
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
