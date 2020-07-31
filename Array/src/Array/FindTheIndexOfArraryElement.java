package Array;


public class FindTheIndexOfArraryElement {
	public static int n(int a[], int x) {
		if (a==null) 
		{ 
			return -1;
		}
		int l=a.length;
		int r=0;
		while (r<l) 
		{
		if (a[r]==x) 
		{
			return r;
		}
		else 
		{
			r=r+1;
		}
		
		}
	
		return -1;
}
	public static void main(String[] args) {
		int a[]= {1,3,2,4,6,7,8};
		System.out.println("my position is-"+n(a,1));
	}
}