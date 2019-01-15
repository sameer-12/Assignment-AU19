package com.accolite.au.practice;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String args[])
	{
	List<Person> PersonList = new LinkedList<>();
		List<Integer> integers = new LinkedList<>();
		integers.add(1);
		integers.add(12);
		System.out.print(integers.contains(1));
	PersonList.add(new Person("amit","vikram",89));
		
		HashSet<Person> personHashset = new HashSet<>();
		personHashset.add(new Person("amit","ram",12));
		System.out.println()
		
		
	}

}
