
public class C {
	public void m1()
	{
		System.out.println("m1 1st C");
		System.out.println("m1 2nd C");
	}
	public void m2()
	{
		System.out.println("m2 1st C");
		B b=new B();
		b.m2();
		System.out.println("m2 2nd C");
		System.out.println("End of Process");
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		C c= new C();
		c.m2();
		
				
	}
}
