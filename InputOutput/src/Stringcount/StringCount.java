package Stringcount;



public class StringCount {
public static void main(String[] args) {
	int count =0;
	int count1=0;
	String s= " Complete Java Classes";
	
for (int i=0;i<s.length();i++) {
	
		if(s.charAt(i)!=' ')
		count++;
		
	
}
System.out.println("String-Complete Java Classes");
System.out.println("Total No OF Characters-"+count);
System.out.println("----------------------------------------------------");
String s1= " Complete Java Classes ";
String[] s2=s1.split(" ");

for (int i=1;i<s2.length;i++) {
	
	String s3=s2[i];
	count1++;
	
	

}System.out.println("String- Complete Java Classes");
	System.out.println("Total No OF words-"+count1);
	System.out.println("----------------------------------------------------");
	
String s3="abcd";
String S4="xyz";
System.out.println("String 1="+s3);
System.out.println("String 2="+S4);
{
	 s3=s3+S4;
	 S4=s3.substring(0,s3.length()-S4.length());
	
	 s3=s3.substring(S4.length());
	 System.out.println("After Swaping");
	 System.out.println("String 1="+s3);
	 System.out.println("String 2="+S4);
	
}
	

}

}
