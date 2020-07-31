package SortTask;



public class Student implements Comparable <Student> {

	private String rollno;
	private String name;
	private String city;
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public int compareTo(Student o) {
		Student stu= (Student) o;
		return this.rollno.compareTo(stu.rollno);
		
	}
	
}
