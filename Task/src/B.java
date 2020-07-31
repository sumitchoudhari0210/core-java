
public class B {
	public void m1()
	{
		System.out.println("m1 1st B");
		C c=new C();
		c.m1();
		System.out.println("m1 2nd B");
	}
	public void m2()
	{
		System.out.println("m2 1st B");
		A a = new A();
				a.m2();
		System.out.println("m2 2nd B");
	}
}
