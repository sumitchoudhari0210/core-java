package Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class ReaderWriterBuffer {
	public static void main(String[] args) throws IOException {
		
		File f1= new File("abc.txt");
		
		FileWriter f2= new FileWriter(f1);
		f2.write("11111");
		f2.write("\n");
		f2.write("22222");
		f2.write("\n");
		f2.write("33333");
		f2.write("\n");
		f2.write("44444");
		f2.write("\n");
		f2.write("55555");
		f2.flush();
		f2.close();
		
		File f4= new File("pqr.txt");
		FileWriter f3= new FileWriter(f4);
		f3.write("AAAAA");
		f3.write("\n");
		f3.write("BBBBB");
		f3.write("\n");
		f3.write("CCCCC");
		f3.write("\n");
		f3.write("DDDDD");
		f3.write("\n");
		f3.write("EEEEE");
		f3.flush();
		f3.close();
		
		File f5= new File("output.txt");

        
        PrintWriter p1 = new PrintWriter("output.txt"); 
          
      
        BufferedReader b = new BufferedReader(new FileReader("abc.txt")); 
          
        String line = b.readLine(); 
          
        
        while (line != null) 
        { 
            p1.println(line); 
            line = b.readLine(); 
        } 
          
        b = new BufferedReader(new FileReader("pqr.txt")); 
          
        line = b.readLine(); 
       
        while(line != null) 
        { 
            p1.println(line); 
            line = b.readLine(); 
        } 
          
        p1.flush();
		
		//BufferedWriter b= new BufferedWriter(f1);
		
		//FileReader f2= new FileReader("abc.txt");
		
		//BufferedReader b1= new BufferedReader(f2);
		
		
	}

}
