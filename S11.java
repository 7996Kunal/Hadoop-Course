import java.util.*;
class S11
{
	public static void main(String[] ar)
	{
		TreeSet<String> lst=new TreeSet<>();
		lst.add("A1");
		lst.add("First");
		lst.add("Second");
		lst.add("Third");
		lst.add("Fourth");
		lst.add("First");
		lst.add("Fifth");
		lst.add("Sixth");
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		lst.remove("Second");
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		System.out.println(lst.contains("First"));
		System.out.println(lst.contains("Tenth"));
		System.out.println();
		for(String item:lst)
		{
			System.out.println(item);
		}
		System.out.println();
		Iterator<String> itr=lst.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
	}
}