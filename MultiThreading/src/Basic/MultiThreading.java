package Basic;

public class MultiThreading extends Thread{

		int st;
		int end;
		public MultiThreading(int st, int end) {
		
			this.st = st;
			this.end = end;
		}
		
		
	public void run() 
	{
		for(int i =st; i <end;i++) 
		{
			System.out.println(currentThread().getName());
			System.out.println(i);
			i++;
		}
	}

}
 