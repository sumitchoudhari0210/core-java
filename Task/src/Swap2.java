
public class Swap2 {
	
		
	 int a=10;
	 int b=20;
public void m1()
{
	int c=30;
	int d=40;
	a=c;
	b=d;
	c=d-c;
	d=a-c;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
}
public static void main(String[] args) {
	Swap2 a= new Swap2();
	a.m1();
}
}
