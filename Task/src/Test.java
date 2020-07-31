
public class Test {

	private Test () {}
	private static Test t;
	public static Test m1() {
		if (t==null)
			t= new Test();
		return t;
		
	}
	
	 }
	 
		
		

		
		
	

	
