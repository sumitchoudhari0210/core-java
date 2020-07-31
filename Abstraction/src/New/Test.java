package New;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
	
		
		
	System.out.println("select 1:Rectangle, 2-Squre 3:Circle");
		int c=sc.nextInt();
		switch (c) {
		case 1:
		Shape i= new Rectangle();
		i.draw();
		i.getArea();
		
		case 2:

		Shape j= new Squre();
		j.draw();
		j.getArea();
		
		case 3:

		Shape k= new Circle();
		k.draw();
		k.getArea();
		
		
		
		
	}

	}}
