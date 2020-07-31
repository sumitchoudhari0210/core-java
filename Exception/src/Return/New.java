package Return;

public class New {
	public int m1()
	{
		int x=10;
		try
		{System.out.println(x);
		return x;
		}
		finally {
			 x=20;
			System.out.println(x);
			
		return x;
		}
	}
	public static void main(String[] args) {
		New n= new New();
		int s=n.m1();
		
		System.out.println(s);
	}
	

}
