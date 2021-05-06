package com.org.service;

import com.org.soap.Person;

public interface PersonService {

	public boolean addPerson(Person p);
	
	public boolean deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();
}
