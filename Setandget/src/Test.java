
public class Test {
	public Student setdata() {
		Student Naresh= new Student();
		Naresh.rollno=456;
		Naresh.Name="Naresh R";
		return Naresh;
	}	
	public Student setdata2()
	{
		Student Rakesh=new Student();
		Rakesh.rollno=457;
		Rakesh.Name="Rakesh S";
		return Rakesh;
	
	}
	public void getdata()
	{
Test t1= new Test();
Student stu1=t1.setdata();
Test t2=new Test();
Student stu2=t2.setdata2();
		
		System.out.println(stu1.rollno);
		System.out.println(stu1.Name);
		System.out.println(stu2.rollno);
		System.out.println(stu2.Name);
	}
	 
	public static void main(String[] args) {
		Test t2=new Test();
		t2.getdata();
		
	}
}
