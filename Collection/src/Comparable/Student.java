package Comparable;

public class Student implements  Comparable<Student>{
	private int rollno;
	private String name;
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
	@Override
	public int compareTo (Student o) {
		Student stu=o;
		//return this.rollno - stu.rollno;
		return this.name.compareTo(stu.name);
		
	}
	
	
	}
	
	
	
	


