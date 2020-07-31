package Task;

import java.util.ArrayList;
import java.util.List;

public class Decending {
	public static void main(String[] args) {
		List <Integer> l= new ArrayList();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(8);
		l.add(90);
		
		
		
		for(int i=0;i<l.size();i++) {
			for(int j=l.size()-1;j>i;j--) {
				if(l.get(i)<l.get(j)) {
					
					int t=l.get(i);
					l.set(i, l.get(j));
					l.set(j, t);
				}
				
				
			}
		}
		
		for (int i:l) {System.out.println(i);}
		
	}
}
