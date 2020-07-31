package SortTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		
		Student s1= new Student();
		s1.setRollno("2");
		s1.setName("Satish");
		s1.setCity("Pune");
		
		
		Student s2= new Student();
		s2.setRollno("6");
		s2.setName("Akash");
		s2.setCity("Pune");
		
		Student s3= new Student();
		s3.setRollno("1");
		s3.setName("Rukesh");
		s3.setCity("Amravati");
		
		FileWriter fw1= new FileWriter("Satish.txt");
		BufferedWriter fw= new BufferedWriter(fw1);
		
		fw.write(s1.getRollno()); 
	    fw.write(" ");
		fw.write(s1.getName());
		 fw.write(" ");
		fw.write(s1.getCity());
		 fw.write(" ");
		fw.write("\n");
		fw.write(s2.getRollno());
		 fw.write(" ");
		fw.write(s2.getName());
		 fw.write(" ");
		fw.write(s2.getCity());
		 fw.write(" ");
		fw.write("\n");
		fw.write(s3.getRollno()); 
		 fw.write(" ");
		fw.write(s3.getName());
		 fw.write(" ");
		fw.write(s3.getCity());
		 fw.write(" ");
		fw.flush();
		
		FileReader fr= new FileReader("C:\\ecs\\InputOutput\\Satish.txt");
		BufferedReader fr1= new BufferedReader(fr);
		String s=fr1.readLine();
		
		Set<Student> st= new TreeSet<Student>();
		
		
		while(s!=null) 
		{
			String[] str=s.split(" ");
			
				Student stud=new Student();
				stud.setRollno(str[0]);
				stud.setName(str[1]);
				stud.setCity(str[2]);
				st.add(stud);
			
		s=fr1.readLine();
		
	}
		for (Student stude : st) {
			System.out.println("Rollno-"+stude.getRollno());
			System.out.println("Name-"+stude.getName());
			System.out.println("City-"+stude.getCity());
		}
		
	}

}
