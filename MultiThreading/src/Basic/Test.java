package Basic;

public class Test {
	
		 public static void main(String[] args) {
		
			MultiThreading odd= new MultiThreading(1,99);
			MultiThreading even= new MultiThreading(2,98);
			
			odd.setName("odd thread");
			even.setName("even thread");
		
			odd.start();
			even.start();
			odd.run();
			even.run();
			
		}
	 }

