package list.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		Address a1=new Address();
		a1.setCityname("nagpur");
		a1.setAreaname("Omkarnagar");
		
		
		Address a2= new Address();
		a2.setCityname("Bangluru");
		a2.setAreaname("Electronic City 2");
		
		List<Address> l=new ArrayList();
		l.add(a1);
		l.add(a2);
		
		Student s1= new Student();
		s1.setName("Aman");
		s1.setRollno(3);
		s1.setAdr(l);
		
	
		Iterator<Address> it1= l.iterator();
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
		
		while(it1.hasNext()) {
			
			
			Address ad2= it1.next();
			
		
		System.out.println(ad2.getAreaname());
		System.out.println(ad2.getCityname());
		System.out.println();
	
			
		}
		
		
	
		
		
		
		
		
		
	}

}
