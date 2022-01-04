package com.revature.datatypes;

public class Driver {

	public static void main(String[] args) {
		 // how to intialized a new DataTypes class called an "Instantiation"
		
		datatypes dt = new DataTypes();  // datatypes dt is declaring a variable of thype datatypes. 
		// the new keyword requests a block of memory of datatypes size to store the object in, and returns the memory address
		// the final word DataTypes(), says to run the constructor imediatley on creation
		
		// one way to get the answer
		System.out.println(dt.add(1, 2));
		
		// a different and 'cleaner' way to get the answer
		int answer = dt.add(1, 2);
		system.out.println(answer);
		
		Dog felix = new Dog(), henry = new Dog(), patty = new Dog();
		
		felix.name = "Felix";
		felix.age = 2;
		felix.weight = 106.5;
		felix.breed = "German Shepard"; 
		
		d.printDogName(felix);
		
	}
}
