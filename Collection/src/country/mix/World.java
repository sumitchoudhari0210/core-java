package country.mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class World {
public static void main(String[] args) {
	
	List<String> mh= new ArrayList<>();
	mh.add("City in Maharashtra:Nagpur");
	mh.add("City in Maharashtra:Pune");
	
	List<String> jh= new ArrayList<>();
	jh.add("City in Jharkhand:Ranchi");
	jh.add("City in Jharkhand:Wasepur");
	
	List<String> tx= new ArrayList<>();
	tx.add("City in Texas:Austin");
	tx.add("City in Texas:Hoston");
	
	List<String> cf= new ArrayList<>();
	cf.add("City in Calefornia:los Angeles");
	cf.add("City in Calefornia:San diego");
	
	Map<String, List<String>> India= new HashMap<>();
	India.put("State Maharashtra", mh);
	India.put("State Jharkhand", jh);
	
	
	Map<String, List<String>> Us= new HashMap<>();
	Us.put("State Texas", tx);
	Us.put("State Calefornia", cf);
	
	Map<String,Map <String, List<String>>> world= new HashMap<>();
	world.put("Country India", India);
	world.put("Country USA", Us);
	
	Set <String> countrykeys= world.keySet();
	
	Iterator <String> itr=countrykeys.iterator();
	while(itr.hasNext()) {
	
	String country=itr.next();
	System.out.println(country);
	
	Map<String, List<String>> states= world.get(country);
	
	Set<String> keys1=states.keySet();
	
	Iterator <String> itr2= keys1.iterator();
	while(itr2.hasNext()) {
		String state= itr2.next();
		System.out.println(state);
		
		List <String> cities= states.get(state);
		
		Iterator <String> itr3= cities.iterator();
		while(itr3.hasNext()) {
			String city= itr3.next();
			
			
			System.out.println(city);
		}
		
	}
	
			
			
	}
	
	
	
	
	
	
	
	
	
}
}
