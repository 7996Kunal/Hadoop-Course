import java.io.*;
class p21
{
	public static void main(String[] ar)
	{
		try{
			FileInputStream fin=new FileInputStream("t1.txt");
			InputStreamReader inr=new InputStreamReader(fin);
			BufferedReader bfr=new BufferedReader(inr);
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
