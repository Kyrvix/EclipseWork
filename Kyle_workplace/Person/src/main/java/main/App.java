package main;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Person dave = new Person("Dave", 24, "Cleaner");
		Person bob = new Person("Bob", 29, "Manager");
		Person will = new Person("Dick", 35, "Consultant");
//		System.out.println(dave.toString());
//		System.out.println(bob.toString());
//		System.out.println(will.toString());
		
		List<Person> listOfPerson = new ArrayList<Person>();
		listOfPerson.add(dave);
		listOfPerson.add(bob);
		listOfPerson.add(will);
		listOfPerson.forEach(System.out::println);
		
		bob.setAge(60);
		
		findPerson(listOfPerson, "Dick");
	}
	
	public static String findPerson(List<Person> lp , String name) {
		for(int i = 0; i < lp.size(); i++) {
			if(lp.get(i).toString().contains(name)) {
				System.out.println(lp.get(i));
				return "Person found";
			}
			else {
				
				return "Person not found";
			}
		}
		return "Person not found";
	}
}

