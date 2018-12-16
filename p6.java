import java.util.*;
class p6
{
	public static void main(String[] ar)
	{
		HashSet<String> lst=new HashSet<>();
		lst.add("First");
		lst.add("Second");
		lst.add("Third");
		lst.add("A4");
		lst.add("Fourth");
		lst.add("Fifth");
		lst.add("A4");
		lst.add("Sixth");
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		lst.remove(0);				// No Effect
		lst.remove(lst.size()-1);	// No Effect
		lst.remove("First");
		lst.remove("A4");
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		//System.out.println();
		//for(int i=0;i<lst.size();i++)
		//{
		//	String ss=lst.get(i);
		//	System.out.println(ss);
		//}
		System.out.println();
		for(String item:lst)
		{
			System.out.println(item);
		}
		System.out.println();
		Iterator<String> itr=lst.iterator();
		while(itr.hasNext())
		{
			String a=itr.next();
			System.out.println(a);
		}
	}
}