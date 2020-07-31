package Throws;

public class Validtest {
	public void m1() throws Exception
	{
		Validtest a=new Validtest();
		a.m2();
	}
	public void m2() throws Exception
	{
	   Validtest a=new Validtest();
		a.m3();
	}
	public void m3()throws Exception
	{
	Thread.sleep(-300);
		System.out.println("abcd");
	}
	public static void main(String[] args) {
		Validtest a=new Validtest();
		try
		{
		a.m1();
		}
		catch(Exception e )
		{
			//e.printStackTrace();
			System.out.println(e.toString());
			
		}
			
			
	}
	}

