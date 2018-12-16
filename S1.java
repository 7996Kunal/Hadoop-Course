class Box
{
	Object item;
	void put(Object x)
	{
		item=x;
	}
	Object get()
	{
		return item;
	}
}
class S1
{
	public static void main(String[] ar)
	{
		int a1=213;
		double[] a2={12.56,890.23,8903.7,906.2};
		String a3="hello";
		Student a4=new Student();
		a4.name="Abhay";
		Box b1=new Box();
		b1.put(a1);
		Object m=b1.get();
		int m1=(int)m;
		System.out.println(m1*10);
	}
}
class Student
{
	String name;
}