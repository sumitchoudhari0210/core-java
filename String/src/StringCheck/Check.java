package StringCheck;

public class Check {
	public static void main(String[] args) {
		String s="cjc";
		String s1="cjc";
		String s2=new String ("cjc");
		String s3=new String ("cjc");
		String s4=new String ("Hello");
		
		System.out.println("equals");
		
		System.out.println(s.equals(s1));
		System.out.println(s2.equals(s3));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s4));
		System.out.println(s2.equals(s4));
		
		System.out.println(  "  ");
		
		System.out.println("==");
		System.out.println(s==s1);
		System.out.println(s2==s3);
		System.out.println(s==s2);
		System.out.println(s==s4);
		System.out.println(s2==s4);
		
	}
	

}
