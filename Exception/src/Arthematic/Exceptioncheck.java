package Arthematic;

import java.util.Objects;



public class Exceptioncheck {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
		int a=10/0;}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.toString());
			//System.out.println(e.getMessage());}
		
		// his will send error to JVM
		
	System.out.println("in main end    ");
	
	}
}}