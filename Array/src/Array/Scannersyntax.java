package Array;
import java.util.Scanner;


public class Scannersyntax {
	public static void main(String[] args) {
		int a[]=new int[3];
		Scanner b=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.println("Enter Your intiger to store value");
			a[i]=b.nextInt();
			
		}
		for(int j=0;j<a.length;j++) 
		{
			
			System.out.println(a[j]);
		}
		}
	



}
