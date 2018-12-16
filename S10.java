import java.util.*;
class S10
{
	public static void main(String[] ar)
	{
		HashSet<String> lst=new HashSet<>();
		lst.add("A1");
		lst.add("First");
		lst.add("Second");
		lst.add("Third");
		//lst.add(0,"A5");
		//lst.add(2,"A3");
		//lst.add(2,"A6");
		lst.add("Fourth");
		lst.add("First");
		lst.add("Fifth");
		lst.add("Sixth");
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		lst.remove(0);		// No Effect
		lst.remove(lst.size()-1); // No Effect
		lst.remove("Second");
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		System.out.println(lst.contains("First"));
		System.out.println(lst.contains("Tenth"));
		/*System.out.println();
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i));
		}*/
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