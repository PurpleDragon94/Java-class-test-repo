package com.revature.datatypes;

public class flowControl {
	
	public void flowControl() {
		boolean myboolean = true;
		int i = 5;
		

		if (myboolean) {
			// this code runs if true
		} else if(i > 5){
			// code runs if i is greater thatn 5
			
		} else {
			// this code runs if false
			// this is the catch all block, runs if no other else if statement runs	
		}
		
		// while loops are meant to run some number of loops until the boolean check is failed
		while(myboolean) {
			// this will run indefinatly, since myboolean is true
			
			// unless we do one of 2 things
			
			myboolean = false; 
			// OR
			break; // stops and exits a loop/block
			
		}
		
		//do while loops always run at least once
		do {
			// loop code here
		} while (myboolean); 

		// loops with a numberical requirement require a for loop
		String[] names = {"Jacob", "Daniel", "Allison"}; // this is called array initialization and allows us to create and populate an array at the same time
		
		String[] otherNames = new String[10]; // old array construction requires the size to be specified (10 here)
		
		for (int iteration = 0; iteration < names.length; ++iteration) {
			System.out.println(names[iteration]); // names(iteration[]) element of names with index equal to the value of iteration
			
		}
		
		// enhanced for loop runs for each element in an array, collection, ect.
		for (String s : names) {
			System.out.println(s);
			
		}
	}

}
