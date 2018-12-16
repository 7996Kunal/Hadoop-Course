import java.util.*;
class p2
{
	public static void main(String[] ar)
	{
		//Stack<Integer> s=new Stack<Integer>();
		//Stack<int[]> s=new Stack<int[]>();
		//Stack<Date> s=new Stack<Date>();
		Stack<String> s=new Stack<>();
		/*
			void push(String item)
			String pop()
			String peek()
			boolean isEmpty()
			int size()
		*/
		s.push("A1");
		s.push("A2");
		s.push("ABC");
		s.push("A3");
		s.push("A4");
		s.push("A5");
		s.push("HELLO");
		System.out.println(s);
		System.out.println("Total Values:"+s.size());
		String a1=s.pop();
		String a2=s.pop();
		String a3=s.pop();
		String a4=s.pop();
		System.out.println(s);
		System.out.println("Total Values:"+s.size());
		System.out.println(a1.toLowerCase());
	}
}