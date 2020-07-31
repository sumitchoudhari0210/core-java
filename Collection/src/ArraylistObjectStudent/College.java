package ArraylistObjectStudent;

import java.util.ArrayList;
import java.util.List;

import ArraylistExampleStudent.Student;

public class College {
	
	public List m1() {
		List l = new ArrayList();
		
		Student s1= new Student();
		s1.setRollno(1);
		s1.setName("Xyz");
		
		Student s2= new Student();
		s2.setRollno(2);
		s2.setName("Abc");
		
		l.add(s1);
		l.add(s2);
		return l;
	}

}
