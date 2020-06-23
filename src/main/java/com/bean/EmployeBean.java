package com.bean;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("emp")
public class EmployeBean {

	
	private int eId;
	private String eName;
	@Autowired
	Salary salary;
	Date date;
	
	
	//ArrayList<String> student=new ArrayList<String>();
	
	
	public Date getDate() {
		return date;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int geteId() {
		return eId;
	}
	/*public ArrayList<String> getStudent() {
		return student;
	}
	public void setStudent(ArrayList<String> student) {
		this.student = student;
	}*/
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public void display()
	{
		System.out.println("eid:"+eId);
		System.out.println("ename:"+eName);
		System.out.println("Salary:"+salary);
		//System.out.println("Date"+date.getTime());
		
	}
	/*
	 * @PostConstruct public void initmethod() {
	 * System.out.println("init method called"); }
	 */
	
}
