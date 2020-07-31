package polymorphism;

public class B {
	public void m1(Object a) {
		System.out.println("m1----object");
	}

	public void m1(String a){
	 System.out.println("m1-----string");
		
		
	}
public static void main(String[] args) {
	B b = new B();
	b.m1(null);
	b.m1((Object) null);		
}
}
