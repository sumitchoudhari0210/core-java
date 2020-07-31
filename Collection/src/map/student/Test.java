package map.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	
	Map <String, Student> m= new HashMap();
	
	Student s= new Student();
	s.setId("123456");
	s.setName("Mohit");
	
	Student s1= new Student();
	s1.setId("1234");
	s1.setName("Rohit");
	
	Student s2= new Student();
	s2.setId("12345");
	s2.setName("lohit");
	
	m.put("Ro432", s1);   
	m.put("lo654", s2);
	m.put("mo654", s);
	
	Set <String > keys= m.keySet();
	
	Iterator <String> itr= keys.iterator();
	while(itr.hasNext()) {
		String skey=itr.next();
		Student val=m.get(skey);
		System.out.println(val.getId());
		System.out.println(val.getName());
	}
	
}
}
