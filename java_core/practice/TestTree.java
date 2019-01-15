package com.accolite.au.practice;
import java.util.TreeSet;
import java.util.Comparator;
public class TestTree {
	public static void main(String args[])
	{
	TreeSet<Person> set =  new TreeSet<>(new Comparator<Person>()
			{
		@Override
		public int compare(Person p1, Person p2)
		{
		//	return p2.getFirstame().compareTo(p1.getFirstame());
			return (p1.getAge()>(p2.getAge())?1:-1);
		}
			});
	
	set.add(new Person("gjkb","fj",43));
	set.add(new Person("hhu","fr",12));
		for(Person p: set)
	{
		System.out.println(p.getAge());
	}
	}

}
