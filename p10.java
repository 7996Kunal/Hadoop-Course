class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I="+i);
		}
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		for(int k=11;k<=20;k++)
		{
			System.out.println("K="+k);
		}
	}
}
class p10
{
	public static void main(String[] ar)
	{
		Thread1 t1=new Thread1();
		Thread t2=new Thread(new Thread2());
		System.out.println("Starting 1");
		t1.start();
		System.out.println("Starting 2");
		t2.start();
		System.out.println("End of Main");
	}
}
