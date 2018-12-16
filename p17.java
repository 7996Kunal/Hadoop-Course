import java.io.*;
class p17
{
	public static void main(String[] ar)
	{
		try{
			FileInputStream fin=new FileInputStream("t1.txt");
			int a1=fin.read();
			int a2=fin.read();
			int a3=fin.read();
			fin.skip(10);
			byte[] b=new byte[3];
			fin.read(b);
			int a4=fin.available();
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(b[0]);
			System.out.println(b[1]);
			System.out.println(b[2]);
			System.out.print("Remaining:"+a4);
			fin.close();
		}catch(Exception ee){}
	}
}
