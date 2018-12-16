import java.util.*;
class S12
{
	public static void main(String[] ar)
	{
		TreeSet<Integer> lst=new TreeSet<>();
		lst.add(78);
		lst.add(27);
		lst.add(480);
		lst.add(260);
		lst.add(62);
		lst.add(2370);
		lst.add(45);
		lst.add(5);
		System.out.println(lst);
		System.out.println("Total Elements "+lst.size());
		Iterator<Integer> itr=lst.iterator();
		while(itr.hasNext())
		{
			int s=itr.next();
			System.out.println(s);
		}
	}
}