package New;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
	public static void main(String[] args) throws IOException {
		int count =0;
		int count2=0;
	
	File f= new File("C:\\ecs\\InputOutput\\cjc");
	f.mkdir();
	
	File f1= new File("C:\\ecs\\InputOutput\\cjc\\Java");
	f1.mkdir();
	
	File f2= new File("C:\\ecs\\InputOutput\\cjc\\Hadoop");
	f2.mkdir();
	
	File txt= new File("C:\\ecs\\InputOutput\\cjc\\abc.txt");
	txt.createNewFile();
	
	File pdf= new File("C:\\ecs\\InputOutput\\cjc\\pqr.pdf");
	pdf.createNewFile();

	File csr= new File("C:\\ecs\\InputOutput\\cjc\\xyz.csr");
	csr.createNewFile();
	
	File doc= new File("C:\\ecs\\InputOutput\\cjc\\Java\\mono.doc");
	doc.createNewFile();
	
	String s[]=f.list();
	for (String ss : s) {
		File ss1=new File(f,ss);
		if(ss1.isDirectory())
		{
		count++;
		}
		if(ss1.isFile())
		{
		count2++;
		}
	}
	System.out.println("number of folders="+count);
	System.out.println("number of files="+count2);

	FileWriter f5=new FileWriter("C:\\ecs\\InputOutput\\cjc\\Java\\mono.doc");
	f5.write(65);
	f5.write("fff");
	f5.flush();
	f5.close();
	
FileReader fr= new FileReader("C:\\ecs\\InputOutput\\cjc\\Java\\mono.doc");
int i=(char)fr.read();

while(i>=0) {
	System.out.println((char)i);
i=fr.read();


}fr.close();

}
}