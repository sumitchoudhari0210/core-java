package Task;

public class FindMinimumNumber {
	public static void main(String[] args) {
		
		
		int a[]= {10,25,38,98,65,58,1,9,73,20};
		int min= a[0];
		{
		for(int i=1;i<a.length;i++) 
		{
			if (a[i]< min) 
			{ 
				min = a[i];
			}
		}
	System.out.println("the given numbers in array is:");
	
	for(int i=0;i<a.length;i++) 
	{ 
		System.out.println(a[i]);
		}
	System.out.println("Minimum number is "+ min);
	}
		
	}
		}

