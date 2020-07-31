package Comparable;

import java.util.Comparator;

import Comperator.Student;

public class RollNoSort implements  Comparator<Student> {

	public int compare(Student o,Student o1) 
	{
		return o.getRollno() -(o1.getRollno());
	}
}
