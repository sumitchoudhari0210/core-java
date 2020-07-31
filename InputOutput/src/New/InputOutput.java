package New;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class InputOutput {
	
	public static void main(String[] args) throws IOException {
		
		int count=0;
		int count2=0;
		File f1=new File("C:\\ecs\\");
		System.out.println(f1.exists());

	File f=new File("C:\\ecs\\InputOutput\\abc");
	System.out.println(f.exists());
	f.mkdir();
	File f2=new File("C:\\ecs\\InputOutput\\xyz");
	System.out.println(f2.exists());
	f2.mkdir();
	File f3=new File("C:\\ecs\\InputOutput\\pxr");
	System.out.println(f3.exists());
	f3.mkdir();
	
	String s[]=f1.list();
	System.out.println(s.length);
	/*for (int i=0;i<s.length;i++)
	{
		File ss=new File(f1,s[i]);
		if(ss.isDirectory())
		{
		count++;
		}
	}*/
	
	for (String ss : s) {
		File ss1=new File(f1,ss);
		if(ss1.isDirectory())
		{
		count++;
		}
		if(ss1.isFile())
		{
		count2++;
		}
	}
	System.out.println("number of folders"+count);
	System.out.println("number of files"+count);

		
	
	
	f.createNewFile();
	/*System.out.println(f.length());
	System.out.println(f.exists());
	System.out.println(f.isFile());
	System.out.println(f.isDirectory());
	System.out.println(f.delete());*/
	
	

	/*FileWriter f1=new FileWriter("abc.txt");
	f1.write(97);
	f1.write("fff");
	f1.flush();
*/
}
}
