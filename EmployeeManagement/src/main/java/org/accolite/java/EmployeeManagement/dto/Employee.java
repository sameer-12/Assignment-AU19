package org.accolite.java.EmployeeManagement.dto;
import org.accolite.java.EmployeeManagement.controller.*;
import org.accolite.java.EmployeeManagement.services.*;
public class Employee {
	private String name;
	private int age;
	private int emp_id;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, int emp_id) {
		this.name=name;
		this.age=age;
		this.emp_id=emp_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	
	

}
