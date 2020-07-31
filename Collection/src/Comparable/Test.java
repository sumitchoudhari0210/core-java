package Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Set <Student> st= new TreeSet<>();
		
		Student s= new Student ();
		s.setName("Sumit");
		s.setRollno(3);
		
		Student s1= new Student();
		s1.setName("Satish");
		s1.setRollno(2);
		
		st.add(s);
		st.add(s1);
		
		for(Student str : st) { 
			System.out.println(str.getRollno());
			System.out.println(str.getName());
		}
				
	
}

}
