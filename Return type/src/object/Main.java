package object;

public class Main {
public static void main(String[] args) {
	
	Presentation p=new Presentation();
	Information i=p.x1();
	Presentation2 p2=new Presentation2();
	p2.getdata(i);
	
	System.out.println();
	
	Presentation p3=new Presentation();
	Information i1=p3.x2();
	Presentation2 p4=new Presentation2();
	p4.getdata(i1);
	
	
}
	
}
