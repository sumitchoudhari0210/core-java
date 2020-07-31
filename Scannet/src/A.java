import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Roll No.");
		int a = sc.nextInt();
		System.out.println("Enter Name");
		String Name=sc.next();
		System.out.println("Mobile number");
		long l=sc.nextLong();
		System.out.println("rollno- "+a);
		System.out.println("Name-"+Name);
		System.out.println("Mobile no.-"+l);
	}

}
