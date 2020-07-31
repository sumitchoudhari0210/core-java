package Scanner;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) 
	{
		Scanner rc=new Scanner(System.in);
		System.out.println("Enter Rollno:");
		int a=rc.nextInt();
		Student t= new Student();
		t.setRollno(a);
		
		System.out.println("Enter Name-");
		String v=rc.next();
		t.setName(v);
		System.out.println(t.getRollno());
		System.out.println(t.getName());
	}

}
