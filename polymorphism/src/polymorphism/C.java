package polymorphism;

public class C {
	public void m1(A a) {
		System.out.println("m1----A");
	}

	public void m1(String a){
	 System.out.println("m1-----string");
		
		
	}
public static void main(String[] args){
	C c = new C();
	c.m1((A )null);
	c.m1((String)null);
}
}