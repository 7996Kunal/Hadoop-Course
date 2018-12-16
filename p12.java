import java.util.*;
class p12
{
	public static void main(String[] ar)
	{
		while(true)
		{
			Date d=new Date();
			System.out.print("\r"+d);
			try{
				Thread.sleep(1000);
			}catch(Exception ee){}
		}
	}
}
