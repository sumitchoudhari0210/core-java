package Static;

public class A {
int x;
static int y;
 public static void main(String[] args) {
	
	 A a= new A();
	 a.x=100;
	 a.y=100;
	 A a1= new A();
	 a1.x=200;
	 a1.y=200;
	 System.out.println(a.x);
	 System.out.println(a.y);
	 System.out.println(a1.x);
	 System.out.println(a1.y);
}
}
