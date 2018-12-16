import java.util.*;
class S6
{
	public static void main(String[] ar)
	{
		Stack<String> s=new Stack<>();
		s.push("A1");
		s.push("A2");
		s.push("ABCD");
		s.push("MNO");
		String s1=s.pop();
		System.out.println(s1.length());
	}
}
