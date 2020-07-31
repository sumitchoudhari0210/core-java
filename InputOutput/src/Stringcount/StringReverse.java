package Stringcount;

public class StringReverse {
	public static void main(String[] args) {
		
	
	String s= "This is Sparta";
	String [] str= s.split(" ");
	for(String words : str) {
		
		System.out.println(new StringBuffer(words).reverse()+" ");}
	}

}
