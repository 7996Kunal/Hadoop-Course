import java.io.*;
class p19
{
	public static void main(String[] ar)
	{
		try{
			FileReader fin=new FileReader("t1.txt");
			//FileReader fin=new FileReader("d:/web/r4.jpg");
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
