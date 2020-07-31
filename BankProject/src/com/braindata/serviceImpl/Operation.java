package com.braindata.serviceImpl;
import com.braindata.model.*;
import java.util.Scanner;
import com.braindata.client.*;
import com.braindata.service.*;

public class Operation implements RBI{
	Scanner sc= new Scanner(System.in);
	int count=0;
	Account ashish= new Account();
	
	public void createAccount() 
	{
		
	System.out.println("enter Account no-");
	ashish.setAccno(sc.next());
	System.out.println("enter mob");
	ashish.setMob(sc.next());
	System.out.println("enter gender");
	ashish.setGender(sc.next());
	System.out.println("enter Address");
	ashish.setAddress(sc.next());
	System.out.println("enter Name");
	ashish.setName(sc.next());
	
	while(ashish.getBalance()<500)
	{
	System.out.println("Diposite Account Opening Amount");
	double balance=sc.nextDouble();
	if(balance>500)
	{ 
		ashish.setBalance(balance);
		System.out.println("Account Created");
		
	}
	
	else
	
	{System.out.println("Enter Amount Greater Than 500");
		
		
	}}
		count++;
		
		
	} 
	
	
	

	public void displayAllDetails() 
	{
		if(count>=1)
		{
	System.out.println("Name-"+ashish.getName());
	System.out.println("Account number-"+ashish.getAccno());
	System.out.println("Mobile number-"+ashish.getMob());
	System.out.println("Gender-" +ashish.getGender());
	System.out.println("Address-"+ashish.getAddress());
	System.out.println("Account Balance-"+ashish.getBalance());
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
		double s=ashish.getBalance();
		System.out.println("enter deposite amount");
		ashish.setBalance(s+sc.nextDouble());
		System.out.println(ashish.getBalance());
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
		double s=ashish.getBalance();
		
		System.out.println("enter withdraw amount");
		if(s>500) {
		
			ashish.setBalance(s-sc.nextDouble());}
		else 
		{
		System.out.println("account balence is low");
		}
		}
		else
		{
			System.out.println("Create Account first");
		}
}
	public void balenceInquiry() 
	{
		if(count>0) {
	System.out.println(ashish.getBalance());
}
	
	else
	{
		System.out.println("Create Account first");
	}
}
}