package Synchronized;

public class Test 
{
	public static void main(String[] xyz) 
	{
		Hello h= new Hello();
		MyThread t1= new MyThread(h,"Aa raha hu mai");
		MyThread t2= new MyThread(h,"Mai hu Don");
		t1.start();
		t2.start();
		
		Hello h1= new Hello();
		MyThread t3= new MyThread(h1,"Baburao");
		MyThread t4= new MyThread(h1,"Kaisa don banega rey tu");
		t3.start();
		t4.start();
	}

}
