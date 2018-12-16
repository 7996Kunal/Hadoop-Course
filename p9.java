import java.util.*;
class p9
{
	public static void main(String[] ar)
	{
		Hashtable<String,String> ht=new Hashtable<>();
		ht.put("Name","Abhishek");
		ht.put("City","Meerut");
		ht.put("Age","18");
		ht.put("Course","MBA");
		String value=ht.get("Age");
		System.out.println(value);
		System.out.println(ht);
		System.out.println();
		Enumeration<String> e=ht.keys();
		System.out.println();
		while(e.hasMoreElements())
		{
			String k=e.nextElement();
			System.out.println(k);
			System.out.println(ht.get(k));
		}
		System.out.println();
		Enumeration<String> ee=ht.elements();
		while(ee.hasMoreElements())
		{
			String v=ee.nextElement();
			System.out.println(v);
		}

	}
}