package com.cjc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.model.Batch;
import com.cjc.model.Course;
import com.cjc.model.Faculty;
import com.cjc.model.Student;

public class ServiceImpl implements InterfaceService1 {
	List <Course> course= new ArrayList();
	List <Faculty> faculty= new ArrayList();
	List <Batch> batch= new ArrayList();
	List <Student> student= new ArrayList();
	
	int i=0;
	int count1=0;
	int count2=0;
	
	
	
	
	 Scanner sc= new Scanner(System.in);
	 
	public void addCourse() {
		
		Course c= new Course();
		 
		System.out.println("Enter Course id-");
        c.setId(sc.nextInt());
        System.out.println("Enter Course Name-");
        c.setName(sc.next());
        course.add(c);
        System.out.println("Course Added Successfully");
        i++;
	}

	public void viewCourse() {
		if(i>0) {
		
	Iterator <Course> itr1= course.iterator();
	while(itr1.hasNext()) {
		Course c1=itr1.next();
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		
		}
	
		
	}
	
		else {System.out.println("Add Course First");}
	

		
	}
public void addFaculty() {
	if(i>0){
		
		Faculty f= new Faculty();
	System.out.println("Enter Faculty id-");
    f.setFid(sc.nextInt());
    System.out.println("Enter Faculty Name-");
    f.setfName(sc.next());
    System.out.println("Enter Course For Selection");
    int s=sc.nextInt();
    Iterator <Course> itr1= course.iterator();
	while(itr1.hasNext()) {
		Course c1=itr1.next();
		
		
		if(s==c1.getId()) {
			faculty.add(f);
			System.out.println("Faculty Added Successfully");
			count1++;
		
		}
		else
		{
			System.out.println("Provide correct corse id ");
		
		}
	
	}
	
	}
	else {System.out.println("Add Course First");}
}


public void viewFaculty() {
	if(i>0) {
	Iterator<Faculty> itr2= faculty.iterator();
	while(itr2.hasNext()) {
		Faculty f1=itr2.next();
		System.out.println(f1.getFid());
		
		System.out.println(f1.getfName());
		
		
	}
		
	}else {System.out.println("Add Course First");}
}

public void addBatch() {
	if(count1>0){
		Batch b= new Batch();
	System.out.println("Enter Batch id-");
    b.setBid(sc.nextInt());
    System.out.println("Enter Batch Name-");
    b.setBname(sc.next());
    System.out.println("Enter Faculty For Selection");
    int s1=sc.nextInt();
    Iterator <Faculty> itr3= faculty.iterator();
	while(itr3.hasNext()) {
		
		Faculty f1=itr3.next();
		
		if(s1==f1.getFid()) {
			batch.add(b);
			System.out.println("Batch Added Succesfully");
			count2++;
			
		}else {System.out.println("Provide correct faculty id ");}
	}

	
	}else {System.out.println("Add Faculty First");}
}

public void viewBatch() {
	if(count1>0) {
	Iterator<Batch> itr4= batch.iterator();
	while(itr4.hasNext()) {
		Batch b1=itr4.next();
		System.out.println(b1.getBid());
		System.out.println(b1.getBname());
		
		}}
	else {System.out.println("Add Faculty First");}
	
}

public void addStuent() {
	if(count2>0){
	Student s= new Student();
	System.out.println("Enter Student id-");
    s.setSid(sc.nextInt());
    System.out.println("Enter Student Name-");
    s.setSname(sc.next());
    System.out.println("Enter Batch For Selection");
    int s1=sc.nextInt();
    Iterator <Batch> itr5= batch.iterator();
	while(itr5.hasNext()) {
		 
		Batch f1=itr5.next();
		
		if(s1==f1.getBid()) {
			student.add(s);
		}	else {System.out.println("Provide correct batch id ");
		}
		}
	}else {System.out.println("Add Batch First");}
}

public void viewStudent() {if(count2>0) {

	Iterator<Student> itr6= student.iterator();
	while(itr6.hasNext()) {
		Student s1=itr6.next();
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		
		}}
else {System.out.println("Add Batch First");}
}

}
