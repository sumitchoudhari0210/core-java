package Task;

public class FindMaximumNumber {
	public static void main(String[] args) {
		
	
	int a[]= {10,25,38,98,65,58,1,9,73,20};
	int max= a[0];
	{
	for(int i=1;i<a.length;i++) 
	{
		if (a[i]> max) 
		{ 
			max = a[i];
		}
	}
System.out.println("the given numbers in array is:");
for(int i=0;i<a.length;i++) 
{ System.out.println(a[i]);
	}
System.out.println("Maximum number is "+ max);
}
	
}
	}