package Static;

public class C {
	int x=8;
	static int y=7;
	
	public void m1() {
		System.out.println(x);
		System.out.println(y);
		A a= new A();
		System.out.println(x);
		System.out.println(y);
		System.out.println(A.y);
		// always use this type of comments as the standard comment when using static keyword
	}
		public static void m2()
		
		{
			System.out.println(y);
			// x wont be print in the above statement as the static keyword is present
			// and  static will only allow the static variable to access.
			A a = new A();
			System.out.println(a.x);
			System.out.println(a.y);
			System.out.println(A.y);
			
			
		}
		
		
		
	}
	

