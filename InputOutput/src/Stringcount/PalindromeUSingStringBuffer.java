package Stringcount;

public class PalindromeUSingStringBuffer {
	public static void main(String[] args) {
		
	
	StringBuffer s= new StringBuffer("tenet");
	if(s.toString().equals(s.reverse().toString())) {
		System.out.println("Palindrome");
	}
  
}
}