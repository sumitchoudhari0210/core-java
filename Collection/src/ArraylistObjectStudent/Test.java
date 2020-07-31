package ArraylistObjectStudent;

import java.util.Iterator;
import java.util.List;

import ArraylistExampleStudent.Student;

public class Test {
	public static void main(String[] args) {
		College c= new College();
		List list=c.m1();
		
		Iterator itr= list. iterator();
		while(itr.hasNext())
		{
			
			
			Student  x =(Student) itr.next();
			System.out.println(x.getRollno());
			System.out.println(x.getName());
		}
		
	}

}
