package QueueDemo;

import java.util.*;
class Student
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		List<Student> inf=new Stack<>();
		Student s1=new Student(101,"essra");
		Student s2=new Student(102,"mamtha");
		Student s3=new Student(103,"Falkiya");
		inf.add(s1);
		inf.add(s2);
		inf.add(s3);
		//traverse a list
		for(Student s:inf)
		{
			System.out.println(s.id+" "+s.name);
		}
		
		
		

	}

}
