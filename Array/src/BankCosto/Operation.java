package BankCosto;
import BankCosto.*;

import java.util.Scanner;

public class Operation implements RBI{
	
    
	Scanner sc= new Scanner(System.in);
	int count=0;
	Account [] ac= new Account[2];
	
	public void createAccount() 
	{
	for(int i=0;i<ac.length;i++){
		 Account a= new Account();
		 
		     System.out.println("enter Name");
			a.setName(sc.next());
			
			System.out.println("enter User Name");
			a.setUsername(sc.next());
			
			System.out.println("Set Password");
			a.setPassword(sc.next());
			
			
			System.out.println("enter Account no-");
			a.setAccno(sc.next());
			
	        System.out.println("enter mob");
	        a.setMob(sc.next());
	        
	        System.out.println("enter gender");
	        a.setGender(sc.next());
	        
	        System.out.println("enter Address");
	        a.setAddress(sc.next());
	
	       ac[i]=a;
	
	while(a.getBalance()<500)
	{
	System.out.println("Diposite Account Opening Amount");
	double balance=sc.nextDouble();
	if(balance>500)
	{ 
		a.setBalance(balance);
		System.out.println("Account Created");
		
	}
	
	else
	
	{System.out.println("Enter Amount Greater Than 500");
		
		
	
	}}
		count++;
		
		
	} }
	
	
	

	public void displayAllDetails() 
	{
		if(count>=1)
		{
			
		System.out.println("Enter Account Number For Details");
		String str=sc.next();
		boolean found=false;
		for(int i=0;i<ac.length;i++)
		{  
			found=ac[i].search(str);
			if(found)
			{
				System.out.println("Name-"+ac[i].getName());
				System.out.println("Account number-"+ac[i].getAccno());
				System.out.println("Mobile number-"+ac[i].getMob());
				System.out.println("Gender-" +ac[i].getGender());
				System.out.println("Address-"+ac[i].getAddress());
				System.out.println("Account Balance-"+ac[i].getBalance());
				System.out.println("User Name-"+ac[i].getUsername());
				
				
				break;
			}
		}
		if(!found)
		{
			System.out.println("Search Failed..Account Not Exist..");
		}
		
		
		
		
			}
	
		
	
	
		
		else
		{
			System.out.println("Create Account first");
		}}

	public void dipositeMoney() 
	{
		 if(count>0)
		 {
			 System.out.println("Enter Account Number For Details");
				String str=sc.next();
				boolean found=false;
				for(int i=0;i<ac.length;i++)
				{  
					found=ac[i].search(str);
					if(found)
					{double s=ac[i].getBalance();
					System.out.println("enter deposite amount");
					ac[i].setBalance(s+sc.nextDouble());
					System.out.println(ac[i].getBalance());
					break;
		 }
				}
				if(!found)
				{
					System.out.println("Search Failed..Account Not Exist..");
				}
				}
			else
			{
				System.out.println("Create Account first");
			}
	}
	
	public void withdraw() 
	{
		if(count>0)
		{
			 System.out.println("Enter Account Number For Details");
				String str=sc.next();
				boolean found=false;
				for(int i=0;i<ac.length;i++)
				{  
					found=ac[i].search(str);
					if(found)
					{double s=ac[i].getBalance();
					System.out.println("enter withdraw amount");
					ac[i].setBalance(ac[i].getBalance()-sc.nextDouble());
					System.out.println(ac[i].getBalance());
					break;
		 }
				}
				if(!found)
				{
					System.out.println("Search Failed..Account Not Exist..");
				}
				}
		
		else
		{
			System.out.println("Create Account first");
		}
}
	public void balenceInquiry() 
	{if(count>0)
	{
		 System.out.println("Enter Account Number For Details");
			String str=sc.next();
			boolean found=false;
			for(int i=0;i<ac.length;i++)
			{  
				found=ac[i].search(str);
				if(found)
				{double s=ac[i].getBalance();
				System.out.println(s);
				
				
				break;
	 
				}
			}
			if(!found)
			{
				System.out.println("Search Failed..Account Not Exist..");
			}
			}

	else
	{
		System.out.println("Create Account first");
	}
}
}