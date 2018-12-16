import java.io.*;
class p20
{
	public static void main(String[] ar)
	{
		try{
			FileReader fin=new FileReader("t1.txt");
			BufferedReader bfr=new BufferedReader(fin);
			String s1=bfr.readLine();
			String s2=bfr.readLine();
			String s3=bfr.readLine();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			fin.close();
		}catch(Exception ee){}
	}
}
