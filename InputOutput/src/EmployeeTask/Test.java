package EmployeeTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import SortTask.Student;

public class Test {
	public static void main(String[] args) throws IOException {
		
		Employee e1= new Employee();
		e1.setSalary(120000);
		e1.setName("Rahul");
		
		Employee e2= new Employee();
		e2.setSalary(130000);
		e2.setName("Ashish");
		
		Employee e3= new Employee();
		e1.setSalary(120000);
		e1.setName("Sumit");
		
		FileWriter fw1= new FileWriter("Employee.txt");
		BufferedWriter fw= new BufferedWriter(fw1);
		
		fw.write(e1.getSalary()); 
	    fw.write(" ");
		fw.write(e1.getName());
		 fw.write(" ");
		fw.write(e2.getSalary());
		 fw.write(" ");
		fw.write("\n");
		fw.write(e2.getName());
		 fw.write(" ");
		fw.write(e3.getSalary());
		 fw.write(" ");
		fw.write(e3.getName());
		 fw.write(" ");
		
		
		 fw.write(" ");
		fw.flush();
		
		FileReader fr= new FileReader("C:\\ecs\\InputOutput\\Employee.txt");
		BufferedReader fr1= new BufferedReader(fr);
		String s=fr1.readLine();
		
		Map<String,String> st= new HashMap();
		
		
		while(s!=null) 
		{
			String[] str=s.split(" ");
			
				Employee stud=new Employee();
				st.put(stud.getSalary(),stud.getName());
				
			
		s=fr1.readLine();
		
	}Set <String > keys= 
		 Iterator<String, String> itr= st.iterator();
	}

}
