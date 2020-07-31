package Consumer;

public class Consumer extends Thread{
	Common c;

	public Consumer(Common c) 
	{
		super();
		this.c = c;
	}
    
	public void run()
	{ 
		System.out.println("Consumer Thread");
		while(true) 
	
		{
			int i= c.consume();
					System.out.println("consumer--consume--"+i);
					try 
					{
						sleep(1200);
					} 
					catch (InterruptedException e)
					{
						
						e.printStackTrace();
					}
		}
		
	}
}
