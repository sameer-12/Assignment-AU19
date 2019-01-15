package com.accolite.au.practice;
public class Person  implements Comparable{
private String firstName;
private String LastName;
private int age;
Person(String firstName,String LastName,int age)
{
	this.firstName=firstName;
	this.LastName=LastName;
	this.age=age;
}

public String getFirstame()
{
	return this.firstName;
}
public int getAge()
{
	return this.age;
}
//@Override
//public boolean equals(Object obj)
//{
//	Person that = (Person)obj;
//	return this.firstName.equals(that.getFirstame());
	
//public int compareTo(Person o)
//{
//	this.firstName.compareTo(o.getFirstame());
//}

}
