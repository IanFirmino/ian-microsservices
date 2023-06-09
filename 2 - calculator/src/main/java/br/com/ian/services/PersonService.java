package br.com.ian.services;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.ian.model.Person;

@Service
public class PersonService {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Ian");
		person.setLastName("Firmino");
		person.setAddress("Rua Canuto");
		person.setGender("Male");
		
		return person;
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		
		for(int i = 0; i <= 4; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}

	public Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person Name " + i);
		person.setLastName("Last Name " + i);
		person.setAddress("Local Where u Live " + i);
		person.setGender("Male " + i);
		
		return person;
	}
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
		
	}
}
