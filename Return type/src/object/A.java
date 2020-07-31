package object;

public class A {
int x;

	public A m1()
	{
		A a= new A();
		a.x=100;
		return a;
	}
	public static void main(String[] args) {
		A q=new A();
		A b=q.m1();
		System.out.println(b.x);
		b.x=200;
		System.out.println(b.x);
	}
				
		
	
}
