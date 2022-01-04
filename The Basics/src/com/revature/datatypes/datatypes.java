package com.revature.datatypes;

public class datatypes {

	public void dataTypes() {
		// represent whole numbers
		int i = 0; // variable intialization variable name is established and has an explicit value
		short s;  // half the size of an int (int is 32 bits), variable declaration, no value assigned
		long l; // long is 64 bits
		
		// represent (aproximate)fractions or real numbers
		float f = 3.9f ; // 32 bits
		double d = 3.9; // 64 bits
		
		// letters
		char c = 'c'; // have to use single quotes, can only have one letter/ number 61 bits
		
		// true and false
		
		boolean b = true; // can only be true or false size is iffy (possibly one bit) only need 0 or 1
		
		//the basic unit (almost never used)
		byte bt; // 8 bits can be a number or specify the actual number of bits
		
	}
	
	
	// stuff out into () is sent "into" the function
	public int add(int a, int b) {
		return a + b; 
	}
	
	public void printDogName(Dog d) {
		System.out.println("your dogs name is " + d.name);
	}
	
}
