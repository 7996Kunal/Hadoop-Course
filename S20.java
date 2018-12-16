import java.io.*;
class S20
{
	public static void main(String[] ar)
	{
		try{
			FileReader fin=new FileReader("S1.java");
			BufferedReader bfr=new BufferedReader(fin);
			String s1=bfr.readLine();
			String s2=bfr.readLine();
			String s3=bfr.readLine();
			String s4=bfr.readLine();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			fin.close();
		}catch(Exception ee){}
	}
}