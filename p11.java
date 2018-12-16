class p11
{
	public static void main(String[] ar)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I="+i);
			try{
				Thread.sleep(1000);
			}catch(Exception ee){}
		}
	}
}
