package com.accolite.au.practice;

public class second {
	public static void main(String args[])
	{
		parent p = new child();
		System.out.println(p.a);
	}

}

class parent
{
	int a;
	public parent()
	{
		
		a=10;
	}
}

class child extends parent
{
	public child()
	{
		super();
		a=20;
	}
}
