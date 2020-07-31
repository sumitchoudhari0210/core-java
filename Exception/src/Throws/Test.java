package Throws;

public class Test {
	public void m1(int age) throws AgeInvalidException  {
		System.out.println("m1 starts ");
		if (age<0) {
			AgeInvalidException e= new AgeInvalidException("age Exception");
					throw e;
		}
		System.out.println("m1 end");
	}
public static void main(String[] args) {
	System.out.println("main start");
	Test t = new Test ();
	try {
		t.m1(15);
		}
	catch (AgeInvalidException e )
	{
		System.out.println("catch block  -"+ e.getMessage());
		System.out.println("main end");
		
	}
}}

