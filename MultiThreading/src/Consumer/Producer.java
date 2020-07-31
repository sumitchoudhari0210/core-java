package Consumer;

public class Producer extends Thread
{
	Common c;

	public Producer(Common c)
	{
		
		this.c = c;
	}
	
	public void run()
	{
		System.out.println("Producer thread");
		int i=1;
		while(true) 
		{
			c.produce(i);
			i++;
			
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
