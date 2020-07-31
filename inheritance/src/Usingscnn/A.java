package Usingscnn;
import java.util.Scanner;//where util is the package and scanner is the class 

public class A {
	Scanner sc= new Scanner(System.in);
	
	public Object m1() {
		Student s1= new Student();
		System.out.println("Enter Roll No.");
		s1.setRollno(sc.nextInt());
		System.out.println("Enter name");
		s1.setName(sc.next());
		return s1;
		
		
	}
	public static void main(String[] args) {
		A a = new A();
		Student stu=(Student)a.m1();
				System.out.println(stu.getRollno());
				System.out.println(stu.getName());
	}

}
