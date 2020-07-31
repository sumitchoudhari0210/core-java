package Hashlist;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SimpleHashlist {
	public static void main(String[] args) {
		
	
	List <String> s= new ArrayList<>();
	s.add("abc");
	s.add("aaa");
	s.add("bac");
	s.add("xyz");
	
	
	Set <String> a= new TreeSet<>(s);
	
	for(String cal:a) {
		Collections.sort(s);
		}System.out.println(s);

}
}