class Box<E>
{
	E item;
	void put(E x)
	{
		item=x;
	}
	E get()
	{
		return item;
	}
}
class S2
{
	public static void main(String[] ar)
	{
		int a1=213;
		double[] a2={12.56,890.23,8903.7,906.2};
		String a3="hello";
		Student a4=new Student();
		a4.name="Abhay";
		Box<String> b1=new Box<>();
		b1.put(a3);
		String s=b1.get();
		System.out.println(s.length());
	}
}
class Student
{
	String name;
}