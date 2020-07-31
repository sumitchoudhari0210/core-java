package Comparable;

import java.util.Comparator;

import Comperator.Student;


public class NameSort implements  Comparator<Student>
{
	
	public int compare(Student o,Student o1) 
	{
		return o.getName().compareTo(o1.getName());
	}
}