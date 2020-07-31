package Stringcount;

public class PalindromeUsingString 
{
public static void main(String[] args) 
{
	String s="tenet";
	String store="";
	for(int i=s.length()-1;i>=0;i--)
	{
		store+=s.charAt(i);
		
	}
	if(s.equals(store))	
	{
		System.out.println("String Palindrome");
	}
	else 
	{
		System.out.println("String not Palindrome");
	}
}

}
