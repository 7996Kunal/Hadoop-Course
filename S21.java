import java.io.*;
class S21
{
	public static void main(String[] ar)
	{
		try{
				//FileWriter fw=new FileWriter("d:/a1.txt");
				FileWriter fw=new FileWriter("d:/a1.txt",true);
				fw.write(65);
				fw.write(66);
				fw.write(67);
				fw.close();
				FileOutputStream fw1=new FileOutputStream("d:/a2.txt");
				fw1.write(65);
				fw1.write(66);
				fw1.write(67);
				fw.close();
		}catch(Exception ee){}
	}
}