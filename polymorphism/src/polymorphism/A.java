package polymorphism;

public class A {
	public void m1()
	{
		System.out.println("only m1");
	}
	public void m1(String s)
	{
		System.out.println("its string");
	}
	public void m1(int a)
	{
		System.out.println("only intiger");
	}
	public void m1(int t, String h )
	{
		System.out.println(5+"my name is string");
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m1("abcd");
		a.m1(5);
		a.m1(5, "xyd");
	}

}
