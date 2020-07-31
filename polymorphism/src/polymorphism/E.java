package polymorphism;

public class E {
	public void m1(int a) {
		System.out.println("int --m1");
	}
	public void m1(double b) {
		System.out.println("float --m2");
	}
public static void main(String[] args) {
	E e= new E();
	e.m1(10);
	e.m1(10f);
	e.m1('a');
	e.m1(10l);
	e.m1(10.1d);
	
}
}
