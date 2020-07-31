package Task;

public class RepeatedElement {
	
	 
	public static void main(String[] args) {
		
	int count=0;
		int a[]= {10,25,38,98,10,28,38,98};
		for (int i = 0; i < a.length; i++) {

		    for (int j = i + 1; j < a.length; j++) {

		        if (a[i] == a[j]) 
		        {
		          int b=  a[i]-a[j];
		          
		          
		       
		          System.out.println(a[j]);
		         
		        }
		        
		    }

		}
	}
}