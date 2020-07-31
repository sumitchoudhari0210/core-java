import java.util.Scanner;

public class PowerofdigitsScanner {
	public static void main(String []args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Base value");
	int no1=sc.nextInt();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter power value");
	int power=sc.nextInt();
	int d=no1, sum=1;
	
	
	
		while(power>0)
		{
		
		sum =sum* no1;
		--power;
	
	}
		System.out.println("Answer="+sum);
	}
	
	}
