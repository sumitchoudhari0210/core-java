
public class Multiplicationofdigits {

	 public static void main(String []args)
		{
		int no=34, sum=1;
		while(no>0)
		{
		int rem = no % 10;
		sum = (sum*rem);
		no=no/10;
		}
		System.out.println("multiplication of digits="+sum);
		}
}
