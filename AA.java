import java.io.*;
class AA
{
	public static void main(String[] ar)
	{
		try{
			FileWriter fw=new FileWriter("numbers.txt");
			for(int i=0;i<1000000;i++)
			{
				int n=(int)(Math.random()*1524987964);
				String s=n+",";
				fw.write(s);
			}
			int n1=(int)(Math.random()*1524987964);
			String s1=n1+"";
			fw.write(s1);
			fw.close();
		}catch(Exception ee){}
	}
}