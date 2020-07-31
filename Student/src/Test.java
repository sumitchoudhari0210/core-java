
public class Test {
	
	public Student d1()
	{
		Student ashish=new Student();
		ashish.rollno=1;
		ashish.name="Ashish s";
return ashish;
	}
	public static void main(String[] args) {
		Test t=new Test();
		Student stu=t.d1();
		System.out.println(stu.rollno);
	System.out.println(stu.name);
	}
	}


