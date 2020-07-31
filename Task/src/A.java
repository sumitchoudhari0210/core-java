
public class A {
public void m1()
{
	System.out.println("m1 1st A");
	B b=new B();
	b.m1();
	
	System.out.println("m1 2nd A");
	System.out.println("main in process");
}
public void m2()
{
	System.out.println("m2 1st A");
	
	System.out.println("m2 2nd A");
}
}
