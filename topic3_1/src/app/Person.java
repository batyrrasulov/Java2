package app;

import app.Person;

public class Person implements PersonInterface, Comparable<Person> {
	private String firstName = "Mohammed";
	private String lastName = "Rasulov";
	private int age;
	private boolean running;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
		this.age = person.getAge();
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public boolean equals(Object other) {
		if(other == this) {
			System.out.println("I am here in other == this");
			return true;
		}
		if(other == null) {
			System.out.println("I am here in other == null");
			return false;
		}
		if(getClass() != other.getClass()) {
			System.out.println("I am here in getClass() != other.getClass()");
			return false;
		}
		Person person = (Person)other;
		return (this.firstName == person.firstName && this.lastName == person.lastName); 
	}
	public String toString() {
		return "My class is " + getClass() + " " + this.firstName + " " + this.lastName + ", " + this.age;
		}
	//provide simple console print statement for the walk method
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I am walking!");
		boolean running = false;
	}
	//provide simple console print statement for the run method
	@Override
	public void run() {
		System.out.println("I am running!");
		boolean running = true;
	}
	//define to change the status of above properties with new isRunning method
	@Override
	public boolean isRunning() {
		return running;
	}
	//compare a person by their first name with logic checks for supporting if their first name is the same
	@Override
	public int compareTo(Person p) {
		int value = this.firstName.compareTo(p.firstName);
		//if-else method
		if(value == 0) {
			return this.lastName.compareTo(p.lastName);
		} else {
			return Integer.compare(age, p.age);
		}
	}
}
