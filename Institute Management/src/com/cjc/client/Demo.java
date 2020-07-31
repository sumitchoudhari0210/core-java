package com.cjc.client;

import java.util.Scanner;

import com.cjc.service.InterfaceService1;
import com.cjc.service.ServiceImpl;



public class Demo {
	public static void main(String[] args) {
		
		
		
	
	
	 InterfaceService1 i=new ServiceImpl();
	
	 while (true)
	 {
		 Scanner s1= new Scanner (System.in);
			System.out.println("enter 1-Add Course, 2-View Course, 3-Add Faculty,"
					+ "4-View Faculty ,5-Add Batch, 6-View Batch"
					+ "7- Add Student, 8-View Student, 9-Exit");
			int c2=s1.nextInt();
		
	switch (c2)
	
	{
	case 1:
		
		i.addCourse();
		break;
		
	case 2:
		
		i.viewCourse();
		break;
		
    case 3 :
		
		i.addFaculty();
		break;
		
    case 4 :
		
		i.viewFaculty();
		break;
		
    case 5:
		
		i.addBatch();
		break;
		
    case 6:
    	i.viewBatch();
    	break;
    	
    case 7:
    	i.addStuent();
    	break;
    	
    case 8:
    	i.viewStudent();
    	break;
    	
    case 9:
    	System.exit(0);
	}
}

	}
	

}
