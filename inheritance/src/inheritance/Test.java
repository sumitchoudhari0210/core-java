package inheritance;

public class Test {
	public Object m1() 
	{
		Student stu= new Student();
		stu.setRollno(1);
		stu.setName("Naresh.S");
		return stu;
		}
		
		public static void main (String args[]) {
			Test t= new Test();
			Student s=(Student) t.m1();
			System.out.println("Student Rollno:-"+s.getRollno());
			System.out.println("Student Name:-"+s.getName());
			
			
		}
	
	

}
