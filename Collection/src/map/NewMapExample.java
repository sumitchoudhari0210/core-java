package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NewMapExample {
	public static void main(String[] args) {
		Map <Integer, String> m= new HashMap<>();
		m.put(5, "Java");
		m.put(10, "Python");
		m.put(15,"Spring");
		m.put(20, "Testing");
		
		System.out.println(m);
		
		String val= m.get(5);
		System.out.println(val);
		Set<Integer> keys= m.keySet();
		
		Iterator <Integer> itr=keys.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			String val1=m.get(key);
			System.out.println(val1);
		}
		
	}

}
