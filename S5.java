import java.util.*;
class S5
{
	public static void main(String[] ar)
	{
		Stack s=new Stack();
		s.push(67);
		s.push(23.78);
		s.push("ABCD");
		s.push("MNO");
		Object a1=s.pop();
		String s1=(String)a1;
		System.out.println(s1.length());
	}
}
