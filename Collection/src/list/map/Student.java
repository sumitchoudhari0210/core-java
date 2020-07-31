package list.map;

import java.util.*;

public class Student {

	
	 private int rollno;
	 private String name;
	private List <Address> adr= new ArrayList();
	 
	public List<Address> getAdr() {
		return adr;
	}
	public void setAdr(List<Address> adr) {
		this.adr = adr;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	  
	 }
