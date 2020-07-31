import java.util.Scanner;
public class ReversenoScan {
	
	
	public static void main(String []args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Numerical value");
	int n=sc.nextInt();
	int d=n, sum=0;
	while(n>0)
	{
	int rem = n % 10;
	sum = (sum *10)+ rem;
	n=n/10;
	}
	System.out.println(sum);
	}
	}
