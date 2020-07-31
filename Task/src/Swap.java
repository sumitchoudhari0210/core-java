
public class Swap {
		
	 int a=10;
	 int b=40;
	
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	
	}
public static void main(String[] args) {
	Swap a= new Swap();
	a.m1();
	
	

}
}
