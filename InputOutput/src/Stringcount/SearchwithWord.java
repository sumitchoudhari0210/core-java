package Stringcount;

public class SearchwithWord {
	public static void main(String[] args) {
		String s= "Java classes python classes spring classes";
	  String[] u = s.split(" ");
	  int count=0;
	  for(int i=0; i<u.length;i++) 
		{
	 
	if (u[i].startsWith("classes"))
	{
	count++;}
	}
	  System.out.println("classes-"+count);
}
}