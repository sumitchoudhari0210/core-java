package Array;

public class AvrageOfElement {
	public static void main(String[] args) {
		int a[]= {4,5,6};
		
		int sum=0;
		for(int i=0;i<a.length;i++) 
			
		{
			sum=sum+ a[i];
			
		
		}
		float t= sum/(a.length);
		System.out.println(t);
		}

}
