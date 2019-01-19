package com.journaldev.jaxws.beans;
//package com.journaldev.jaxws.service;

import com.journaldev.jaxws.beans.Person;
public interface PersonFunction {

		public boolean addPerson(Person p);
		
		
		public   boolean deletePerson(int id);
		
		public  Person getPerson(int id);
		
		public  Person[] getAllPersons();
	}
