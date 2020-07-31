package ArraylistExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class NewArrayList {
	public static void main(String[] args) {
		List l1= new ArrayList();
		l1.add(5);
		l1.add(10);
		int oldCapacity=20;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println(newCapacity);
		List l= new ArrayList();
		
		l.add(12);
		
		l.add(15);
		l.add(24);
		l.add(13);
		l.add(108);
		l.add(112);
		l.add(104);

		l.set(3, 60);
		l.add(l1);
		//l.addAll(l1);
		l.remove(1);
		


		System.out.println(l);
		Iterator i=  l.iterator();
		
		while(i.hasNext()) {
			int  x =(int) i.next();
			System.out.println(x);
		}
		System.out.println(l.size());
	}
	}
	


