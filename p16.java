import java.util.*;
class Products implements Comparable<Products>
{
	String name;
	int price;
	int weight;
	Products(String n,int p,int w)
	{
		name=n;
		price=p;
		weight=w;
	}
	public String toString()
	{
		return name+":Rs."+price+":"+weight+" kg";
	}
	public int compareTo(Products pp)
	{
		if(price<pp.price)
			return -1;
		else if (price==pp.price)
			return 0;
		return 1;
	}
}
class p16
{
	public static void main(String[] ar)
	{
		Products p1=new Products("Keyboard",150,1);
		Products p2=new Products("Monitor",4500,3);
		Products p3=new Products("Hard Disk",2550,2);
		Products p4=new Products("Motherboard",7500,1);
		Products p5=new Products("CPU",8500,2);
		TreeSet<Products> hs=new TreeSet<Products>();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		Iterator<Products> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}
