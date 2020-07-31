package ArraylistExampleStudent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List l = new ArrayList();
	
	Student s1= new Student();
	s1.setRollno(1);
	s1.setName("Xyz");
	
	Student s2= new Student();
	s2.setRollno(2);
	s2.setName("Abc");
	
	l.add(s1);
	l.add(s2);
	
	Iterator itr= l.iterator();
	
	while(itr.hasNext()) {
		
		Student  x =(Student) itr.next();
		System.out.println(x.getRollno());
		
		System.out.println(x.getName());
		
		
	}
	
	
}
}
