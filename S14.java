import java.util.*;
class S14
{
	public static void main(String[] ar)
	{
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(1,"Hello");
		ht.put(2,"Second");
		ht.put(3,"Third");
		ht.put(4,"Fourth");
		ht.put(2,"Fifth");
		Enumeration<Integer> e=ht.keys();
		while(e.hasMoreElements())
		{
			int a=e.nextElement();
			System.out.println(a);
		}
	}
}