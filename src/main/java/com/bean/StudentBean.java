package com.bean;

import java.util.Iterator;
import java.util.List;

public class StudentBean {

	List<String> student;

	public List<String> getStudent() {
		return student;
	}

	public void setStudent(List<String> student) {
		this.student = student;
	}
	public void display()
	{
		Iterator<String> itr=student.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
