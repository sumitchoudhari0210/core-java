package BankCostoArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import BankCostoArrayList.*;

public class Operation implements RBI{
	 Account a= new Account();
    
	Scanner sc= new Scanner(System.in);
	int count=0;
	List<Account> ac= new ArrayList();
	
	public void createAccount() 
	{
	
		
		 
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
		ac.add(a);
	
	} 
	
	
	

	public void displayAllDetails() 
	{
		if(count>=1)
		{
			
		System.out.println("Enter Account Number For Details");
		String str=sc.next();
		
		Iterator <Account> itr1= ac.iterator();
		while(itr1.hasNext()) {
			Account a1=itr1.next();
		if(str.equals(a.getAccno())){
			
				System.out.println("Name-"+ a1.getName());
				System.out.println("Account number-"+a1.getAccno());
				System.out.println("Mobile number-"+ a1.getMob());
				System.out.println("Gender-" + a1.getGender());
				System.out.println("Address-"+ a1.getAddress());
				System.out.println("Account Balance-"+ a1.getBalance());
				System.out.println("User Name-"+ a1.getUsername());
		}	
		
		}
		
		}
		
		else
		{
			System.out.println("Create Account first");
		}
	}
	public void dipositeMoney() 
	{
		 if(count>0)
		 {
				
				System.out.println("Enter Account Number For Details");
				String str=sc.next();
				
				Iterator <Account> itr1= ac.iterator();
				while(itr1.hasNext()) {
					Account a1=itr1.next();
				if(str.equals(a.getAccno())){
					
				
					double s=a1.getBalance();
					System.out.println("enter deposite amount");
					a1.setBalance(s+sc.nextDouble());
					System.out.println(a1.getBalance());
					
		 }
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
			
			Iterator <Account> itr1= ac.iterator();
			while(itr1.hasNext()) {
				Account a1=itr1.next();
			if(str.equals(a.getAccno())) {
				
					double s=a1.getBalance();
					System.out.println("enter withdraw amount");
					a1.setBalance(a1.getBalance()-sc.nextDouble());
					System.out.println(a1.getBalance());
					
		 }
				}
				
				}
		
		else
		{
			System.out.println("Create Account first");
		}
}
	public void balenceInquiry() 
	{
		if(count>0) 
		{
		System.out.println("Enter Account Number For Details");
	String str=sc.next();
	
	Iterator <Account> itr1= ac.iterator();
	while(itr1.hasNext()) {
		Account a1=itr1.next();
	if(str.equals(a.getAccno())){
		
	
				{double s=a1.getBalance();
				System.out.println(s);
				
				
				break;
	 
				}
			
			
			}

	else
	{
		System.out.println("Create Account first");
	}
}
}}}