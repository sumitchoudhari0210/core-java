package Switch;

import java.util.Scanner;

public class CalcyScanner {
	public static void main(String[] args) {
		Scanner se= new Scanner (System.in);
		System.out.println("Select Operation 1: add, 2: sub, 3: div, 4:multi");
		int y=se.nextInt();
		switch (y) {
		
		
		case 1:
			{
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter 1st number");
			int a = sc.nextInt();
			System.out.println("Enter 2nd number");
			int b=sc.nextInt();
			int c= a+b;
			System.out.println("Result="+c);}

		case 2:
				Scanner sc= new Scanner (System.in);
			System.out.println("Enter 1st number");
			int d = sc.nextInt();
			System.out.println("Enter 2nd number");
			int e=sc.nextInt();
			int f=d-e;
			System.out.println("Result="+f);
			

		case 3:

				Scanner sm= new Scanner (System.in);
			System.out.println("Enter 1st number");
			int g = sm.nextInt();
			System.out.println("Enter 2nd number");
			int h=sm.nextInt();
			int i=g/h;
			System.out.println("Result="+i);
			
			
	case 4:
				Scanner sl= new Scanner (System.in);
			System.out.println("Enter 1st number");
			int j = sl.nextInt();
			System.out.println("Enter 2nd number");
			int k=sl.nextInt();
			int l=j*k;
			System.out.println("Result="+l);
			}

	}
	}

