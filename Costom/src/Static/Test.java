package Static;

public class Test {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.Rollno=1;
		s1.Name="Naresh";
		
		
		Student s= new Student();
		s.Rollno=3;
		s.Name="Mahesh";
		
		System.out.println("class name:"+s1.CNAME);
		System.out.println("Student name-"+s1.Name);
		System.out.println("Rollno-"+s1.Rollno);
		
		System.out.println("class name:"+s.CNAME);
		System.out.println("Student name-"+s.Name);
		System.out.println("Rollno-"+s.Rollno);

		
	}

}
