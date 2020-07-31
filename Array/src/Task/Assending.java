package Task;

public class Assending {
	public static void main(String[] args) {

	
	
int a[]= {10,25,38,98,65,58,1,9,73,20};

int emp=0;
System.out.println("Ascending Order=");

for(int i=0;i<a.length;i++) 
{
	 for(int j=i+1;j<a.length;j++)

		 if (a[i]> a[j])
		 {
			 emp=a[i];
			a[i]=a[j];
			a[j]=emp;
		 }
	 System.out.print(a[i]);
	 System.out.print(",");
		
	}

	
}}