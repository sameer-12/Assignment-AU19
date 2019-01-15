package com.accolite.au.practice;

public class Employee {
public static void main(String args[])
{
	Developer e = new Developer();
	e.details();
}



public class Manager extends Employee
{
	void details(String name)
	{
		System.out.println("Manager");
	}
	
}


public class Developer extends Employee
{
void details()
	{
		System.out.println("Developer");
	}
	
}




}