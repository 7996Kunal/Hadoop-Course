import java.util.*;
class Student implements Comparable<Student>
{
	int rollno;
	String name;
	int marks;
	Student(int r,String n,int m)
	{
		rollno=r;
		name=n;
		marks=m;
	}
	public String toString()
	{
		return rollno+"]"+name+","+marks;
	}
	public int compareTo(Student ss)
	{
		if(marks<ss.marks)
			return -1;
		else if(marks==ss.marks)
			return 0;
		else return 1;
	}
}
class S13
{
	public static void main(String[] ar)
	{
		Student s1=new Student(1,"Student 1",58);
		Student s2=new Student(2,"Student 2",87);
		Student s3=new Student(4,"Student 3",48);
		Student s4=new Student(7,"Student 4",76);
		Student s5=new Student(3,"Student 5",99);
		Student s6=new Student(8,"Student 6",78);
		Student s7=new Student(5,"Student 7",86);
		Student s8=new Student(6,"Student 8",44);
		Student s9=new Student(9,"Student 9",35);
		TreeSet<Student> lst=new TreeSet<>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		lst.add(s5);
		lst.add(s6);
		lst.add(s7);
		lst.add(s8);
		lst.add(s9);
		Iterator<Student> itr=lst.iterator();
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println(s);
		}
	}
}