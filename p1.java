import java.util.*;
class p1
{
	public static void main(String[] ar)
	{
		Date d=new Date();
		int[] arr={1,2,3,4,5,6,7,8};
		Stack s=new Stack();
		/*
			void push(Object item)
			Object pop()
			Object peek()
			boolean isEmpty()
			int size()
		*/
		s.push(100);
		s.push(56.89);
		s.push("ABC");
		s.push(d);
		s.push(arr);
		s.push(50);
		s.push("HELLO");
		System.out.println(s);
		System.out.println("Total Values:"+s.size());
		Object a1=s.pop();
		Object a2=s.pop();
		Object a3=s.pop();
		Object a4=s.pop();
		System.out.println(s);
		System.out.println("Total Values:"+s.size());
		String s1=(String)a1;
		int s2=(int)a2;
		int[] s3=(int[])a3;
		Date s4=(Date)a4;
		System.out.println(s1.toLowerCase());
		System.out.println(s2*2);
		System.out.println(s3.length);
		System.out.println(s4.getYear());
	}
}