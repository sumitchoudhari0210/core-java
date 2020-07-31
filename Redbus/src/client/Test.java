package client;

import system.TicketBookingThread;
import system.TicketCounter;

public class Test {

    public static void main(String[] args) {
    	int	oldCapacity=15;
    	int newCapacity = oldCapacity + (oldCapacity >> 1);
    	System.out.println(newCapacity);
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"John",1);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"Martin",2);
        
        t1.start();
      
        t2.start();
        
    }

}
