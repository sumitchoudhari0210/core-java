package ArraylistExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BothStringIntInstanceOff {
	public static void main(String[] args) {
		
	
	List l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add("abc");
	l.add(30);
	l.add("xyz");
	
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		Object o=itr.next();
		
		if(o instanceof Integer) 
		{
			int i= (int)o;
			System.out.println(i);
		}
		 if(o instanceof String) 
		{
			String i= (String)o;
			System.out.println(i);
		}
	}

}
}