package polymorphism;

public class D {
	public static void main(String[] args) {
		D.main(1);
		D.main("sdf", 1);
		System.out.println("main 1 main");	
			
		}
	
public static void main(int args2) {
	System.out.println("i am int");


	}
	
public static void main(String args1, int args) {
	System.out.println("i am string and intiger");
}
}
