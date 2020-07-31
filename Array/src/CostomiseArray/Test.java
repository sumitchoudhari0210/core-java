package CostomiseArray;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		Student[] st=new Student [2];
		

		for(int i=0;i<st.length;i++) {
			Student s= new Student();
			System.out.println("Enter Student Id-");
			s.setId(scr.nextInt());
			System.out.println("Enter Student Name-");
			s.setName(scr.next());
			st[i]=s;
		}
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].getId());
			System.out.println(st[i].getName());
		}
	}
	
	

}
