package ArraylistExample;


import java.util.*;

public class ArrayListSimple {
	public static void main(String[] args) {

		List <String> mp= new ArrayList<>();
		mp.add("Bhopal");
		mp.add("Indore");

	List <String> mh= new ArrayList<>();
	mh.add("Pune");
	mh.add("Mumbai");
	

	
	
	List<List<String>> India= new ArrayList<>();
	India.add(mp);
	India.add(mh);
//	
////	Iterator <List<String>> itr=India.iterator();
////	while(itr.hasNext()) {
////		List<String>list=itr.next();
////			
////	
////			Iterator <String> itr1=list.iterator();
////	while(itr1.hasNext()) {
////		String city=itr1.next();
////	System.out.println(city);
//	
//	}
//		
//	} 
	
mp.forEach(System.out::println);
}
}