import java.util.*;
class p4
{
	public static void main(String[] ar)
	{
		//ArrayList<String> lst=new ArrayList<>(); Default Capacity 10
		ArrayList<String> lst=new ArrayList<>(20);
		lst.add("A1");
		lst.add("A2");
		lst.add("A3");
		lst.add("A4");
		lst.add("A5");
		lst.add(0,"A6");
		lst.add(2,"A4");
		lst.add(5,"A7");
		//A6,A1,A4,A2,A3,A7,A4,A5
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		lst.remove(0);
		lst.remove(lst.size()-1);
		lst.remove("A3");
		lst.remove("A4");
		//A1,A2,A7,A4
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		System.out.println();
		for(int i=0;i<lst.size();i++)
		{
			String ss=lst.get(i);
			System.out.println(ss);
		}
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