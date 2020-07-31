
public class Test {
	public A m1()
	{
		//A a = new A();
		//B b =  new B();
		C c = new C();
		return c;
		

	}
	
	public Object m2()
	{
		return null;
		
	}
	
	public float m3()
	{
		return 8.5764f;
		
	}
	 public B m4()
	 {
		// (wrong- as A is parent class cannot return to A)  A a = new A();
			B b =  new B();
			//C c = new C();
			return b;
	 }
	 public C m5()
	 {
		// A a = new A();
			//(only c can be return to this method)B b =  new B();
			C c = new C();
			return c;
	 }
	 public static void main(String[] args) {
		Test t= new Test();
		
				
		
	}
	 
}
