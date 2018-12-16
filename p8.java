import java.util.*;
class Student implements Comparable<Student>
{
	String rollno;
	String name;
	int age;
	int marks;
	public int compareTo(Student ss)
	{
		return -1;
		or
		return 0;
		or
		return 1;
	}
}
class p7
{
	public static void main(String[] ar)
	{
		TreeSet<Student> ts=new TreeSet<>();
		System.out.println(ts);
	}
}