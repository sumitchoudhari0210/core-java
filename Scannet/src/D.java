import java.util.Scanner;
public class D{

public void add () {


Scanner sc= new Scanner (System.in);
System.out.println("Enter 1st number");
int a = sc.nextInt();
System.out.println("Enter 2nd number");
int b=sc.nextInt();
int c= a+b;
System.out.println("Result="+c);}

public void sub (){

	Scanner sc= new Scanner (System.in);
System.out.println("Enter 1st number");
int d = sc.nextInt();
System.out.println("Enter 2nd number");
int e=sc.nextInt();
int f=d-e;
System.out.println("Result="+f);
}

public void div() {


	Scanner sc= new Scanner (System.in);
System.out.println("Enter 1st number");
int d = sc.nextInt();
System.out.println("Enter 2nd number");
int e=sc.nextInt();
int f=d/e;
System.out.println("Result="+f);
}
public void multi(){


	Scanner sc= new Scanner (System.in);
System.out.println("Enter 1st number");
int d = sc.nextInt();
System.out.println("Enter 2nd number");
int e=sc.nextInt();
int f=d*e;
System.out.println("Result="+f);
}


}