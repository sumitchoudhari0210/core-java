import java.util.Scanner;

public class MultiplicationsofdigitScanner {
	public static void main(String []args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Numerical value");
	int n=sc.nextInt();
	int d=n, sum=1;
	while(n>0)
	{
		int rem = n % 10;
		sum = (sum*rem);
		n=n/10;
	}
	System.out.println("multiplication of digits="+sum);
	}
}
