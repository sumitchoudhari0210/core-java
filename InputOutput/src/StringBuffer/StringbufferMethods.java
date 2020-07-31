package StringBuffer;

public class StringbufferMethods {
public static void main(String[] args) {
	

	StringBuffer s= new StringBuffer(50);
	System.out.println("------------------------------------------methods");
	System.out.println("LENGTH AND CAPACITY");
	System.out.println(s.capacity());
	System.out.println(s.length());
	
	System.out.println("------------------------------------------methods");
	System.out.println("APPEND METHOD");
s.append("CJC"+" ");
s.append("CLASSES");
System.out.println(s);


System.out.println("------------------------------------------methods");
System.out.println("Reverse METHOD");
System.out.println(s.reverse());
System.out.println(s.reverse());

System.out.println("------------------------------------------methods");
System.out.println("INSERT METHOD");
System.out.println(s.insert(0, "NEW"));

System.out.println("------------------------------------------methods");
System.out.println("Delete METHOD");
System.out.println(s.delete(0, 3));

System.out.println("------------------------------------------methods");
System.out.println("INDEXOF METHOD");
System.out.println(s);
System.out.println("Index Of SS");
System.out.println(s.indexOf("SS"));

System.out.println("------------------------------------------methods");
System.out.println("CHAR-AT 5");

System.out.println(s.charAt(5));
	
}
}