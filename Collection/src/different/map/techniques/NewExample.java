package different.map.techniques;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NewExample {
	public static void main(String[] args) {
		
		Map <Integer, String> m= new HashMap<>();
		m.put(5, "Java");
		m.put(10, "Python");
		m.put(15,"Spring");
		m.put(20, "Testing");
		
		Set<Entry<Integer, String>> entry= m.entrySet();
		
			Iterator<Entry<Integer, String>> itr=entry.iterator();
			while(itr.hasNext()) {
				Entry key =  itr.next();
				m.get(key);
				System.out.println(key);
				
			
		}
		
		
		
	}

}
