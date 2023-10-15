package app;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//create new Person objects
		Person person1 = new Person("Amir", "Rasulov", 0);
		Person person2 = new Person("Akbar", "Rasulov", 0);
		Person person3 = new Person(person1);
		//test object equality
		if(person1 == person2) {
			System.out.println("These persons are identical using ==");
		}
		else {
			System.out.println("These persons are not identical using ==");
		}
		//test object equality
		if(person1.equals(person2)) {
			System.out.println("These persons are identical using equals()");
		}
		else {
			System.out.println("These persons are not identical using equals()");
		}
		//test copy constructor
		if(person1.equals(person3)) {
			System.out.println("This copied person is identical using equals()");
		}
		else {
			System.out.println("This copied person is not identical using equals()");
		}
		//print the objects
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);
		//make a person walk and run
		person1.walk();
		person1.run();
		System.out.println("Person 1 is running: " + person1.isRunning());
		person1.walk();
		System.out.println("Person 1 is running: " + person1.isRunning());
		//creates a bunch of Persons and compare them as they are sorted on First Name and then Age
		Person[] persons = new Person[4];
		persons[0] = new Person("Ethan", "Morgan", 45);
		persons[1] = new Person("Jack", "London", 24);
		persons[2] = new Person("Maria", "Allen", 87);
		persons[3] = new Person("Amanda", "Jimenez", 88);
		//implement sort algorithm to call the compareTo() method
		Arrays.sort(persons);
		for (int x = 0; x < 4; x++) {
			System.out.println(persons[x]);
		}
	}
}
