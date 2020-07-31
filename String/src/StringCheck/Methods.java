package StringCheck;

public class Methods {public static void main(String[] args) {
	String s="Java";
	String s1="JAVA";
	String s2="abcJavaJava";
	String s3="Complete Java Classes";
	
	
	System.out.println("trim");
	System.out.println(s.trim());
	System.out.println(s1.trim());
	System.out.println(s2.trim());
	System.out.println(s3.trim());
	
	
	System.out.println();
	System.out.println("Replace");
	System.out.println(s.replace(s, s3));
	System.out.println(s1.replace(s1, s2));
	System.out.println(s2.replace(s2, s1));
     System.out.println(s3.replace(s3, s));
     
     

 	System.out.println();
 	System.out.println("substring");
 	System.out.println(s.substring(1, 4));
 	System.out.println(s1.substring(2, 4));
 	System.out.println(s2.substring(2, 8));
    System.out.println(s3.substring(5, 12));
    
    

 	System.out.println();
 	System.out.println("length");
 	System.out.println(s.length());
 	System.out.println(s1.length());
 	System.out.println(s2.length());
    System.out.println(s3.length());
    
    System.out.println();
 	System.out.println("charAt");
 	System.out.println(s.charAt(2));
 	System.out.println(s1.charAt(3));
 	System.out.println(s2.charAt(10));
    System.out.println(s3.charAt(18));
    
    System.out.println();
 	System.out.println("concat");
 	System.out.println(s.concat(s3));
 	System.out.println(s1.concat(s2));
 	System.out.println(s2.concat(s3));
    System.out.println(s3.concat(s));
    
    
    System.out.println();
 	System.out.println("indexOf");
 	System.out.println(s.indexOf(s));
 	System.out.println(s1.indexOf(s));
 	System.out.println(s2.indexOf(s));
    System.out.println(s3.indexOf(s));
    
    
    
    
}

}
