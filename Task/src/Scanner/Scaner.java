package Scanner;
import java.util.Scanner;

public class Scaner 
{
public static void main(String[] args) 
{
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter roll no");
	int RollNo=sc.nextInt();
	
	System.out.println("Enter Student Name");
	String Name=sc.next();
	
	 Student s1= new Student();
	 Address add= new Address();
	 
	 System.out.println("Enter Your Address");
	 String Address=sc.next();
	 
	 System.out.println("Enter Your Cityname");
	 String Cityname=sc.next();
	 
	 System.out.println("Enter Your Areaname");
	 String Areaname=sc.next();
	 
	 System.out.println("Enter Your Pincode");
	 int Pincode=sc.nextInt();
	 
	 
	 add.setCityname(Cityname);
	 System.out.println(s1.getAdd().getCityname());
	 add.setAreaname(Areaname);
	 System.out.println(s1.getAdd().getAreaname());
	 add.setPincode(Pincode);
	 System.out.println(s1.getAdd().getPincode());
	 s1.setAdd(add);
	 System.out.println(s1.getAdd());
	 s1.setRollno(RollNo);
	 System.out.println(s1.getRollno());
	 s1.setName(Name);
	 System.out.println(s1.getName());
	 
	 
	 
	
	
}
}
