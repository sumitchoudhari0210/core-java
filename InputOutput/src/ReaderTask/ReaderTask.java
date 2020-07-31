package ReaderTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ReaderTask {
	public static void main(String[] args) throws IOException {
		
	
	File f1= new File("Read.txt");

	FileWriter f2= new FileWriter(f1);
	
	String c= "1,24,34,55,23,32,43,78,87";
	f2.write(c);
	
	
	   FileReader b = new FileReader(f1);
	   BufferedReader br= new BufferedReader(b);
	  
	 String i=br.readLine();
	 while((i=br.readLine())!=null) {
			System.out.println(i);
		i=br.readLine();


		}
	}

}