package org.accolite.java.EmployeeManagement.services;

import java.util.*;

import org.accolite.java.EmployeeManagement.dto.*;
import org.accolite.java.EmployeeManagement.controller.*;



public class Employee_Services {

	static List<Employee> employee = new ArrayList<>();
	
	
	public Employee_Services() {
		employee.add(new Employee("same",23,1));
		employee.add(new Employee("same",23,3));
		employee.add(new Employee("sameer",23,2));
		
	}
	

	public String getEmployee(Employee emp) {
		return emp.getName();

	}

	public List<Employee> getAll() {
		return employee;
	}

	//public List getById(int id)
//	{
	//	if(employee.emp_id==id)
	//	{
	//		return employee;
	//	}
//	}
	
	public Employee update (Employee e)
	{
		for(Employee emp : employee )
		{
	if(e.getEmp_id()==emp.getEmp_id())
			{
			emp.setAge(e.getAge());
			emp.setName(e.getName());
			return e;
			}
		}
	return null;
		}
		
	public Employee getById(int id)
	{
	for(Employee e: employee)
	{
	if(e.getEmp_id()==id)
	{
	//return e;
		e.setName("ram");
	}
	}
	return new Employee("ram",67,12);
	}
		
	}

	
