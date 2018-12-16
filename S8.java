import java.util.*;
class S8
{
	public static void main(String[] ar)
	{
		//ArrayList<String> lst=new ArrayList<>();
		ArrayList<String> lst=new ArrayList<>(10);
		lst.add("A1");
		lst.add("A2");
		lst.add("A3");
		lst.add("A4");
		lst.add(0,"A5");
		lst.add(2,"A3");
		lst.add(2,"A6");
		lst.add("A7");
		//A5,A1,A6,A3,A2,A3,A4,A7
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		lst.remove(0);
		lst.remove(lst.size()-1);
		lst.remove("A2");
		//A1,A6,A3,A3,A4
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		System.out.println(lst.contains("A3"));
		System.out.println(lst.contains("A8"));
		System.out.println();
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i));
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
			String s=itr.next();
			System.out.println(s);
		}
	}
}