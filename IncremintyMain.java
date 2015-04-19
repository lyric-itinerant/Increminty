///////////////////////////////////////////////////////////////////////////////
//						MADHACKS 2015
//			Main Class:		 IncremintyMain.java
//			This File: 		 IntArray.java, ReCurses.java
//			Hackers: 		Jessie Demers && Megan Tanksley
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class IncremintyMain {
	public static void main(String[] args) {

		// declare scanner
		Scanner scnr = new Scanner(System.in);

		// variables
		String userEntry = "";
			// initialize user input to the empty string
		boolean wentThroughAlphabetLoop = false;
			// returns true if userEntry contains alphabetic character(s)
		int intInput = 0; 
			// the input of the user, converted to an integer
		boolean wentThroughNegativeLoop = false;
		double doubleInput = 0;

		// user prompt 
		System.out.println("Please enter an integer:"); 

		// Store user input
		userEntry = scnr.nextLine();

		// error for no input
		while (userEntry.isEmpty()) {
			System.out.println("Don't do this to me, that's not cool. \n"
					+ "Please enter an integer: "); 
			userEntry = scnr.nextLine();
		}


		// loop through string to make sure it contains no letters
		for (int i = 0; i < userEntry.length(); i++) {
			if (userEntry.charAt(i) == 'A' || userEntry.charAt(i) == 'a'
					|| userEntry.charAt(i) == 'B' || userEntry.charAt(i) == 'b' 
					|| userEntry.charAt(i) == 'C' || userEntry.charAt(i) == 'c' 
					|| userEntry.charAt(i) == 'D' || userEntry.charAt(i) == 'd' 
					|| userEntry.charAt(i) == 'E' || userEntry.charAt(i) == 'e' 
					|| userEntry.charAt(i) == 'F' || userEntry.charAt(i) == 'f' 
					|| userEntry.charAt(i) == 'G' || userEntry.charAt(i) == 'g' 
					|| userEntry.charAt(i) == 'H' || userEntry.charAt(i) == 'h' 
					|| userEntry.charAt(i) == 'I' || userEntry.charAt(i) == 'i' 
					|| userEntry.charAt(i) == 'J' || userEntry.charAt(i) == 'j' 
					|| userEntry.charAt(i) == 'K' || userEntry.charAt(i) == 'k' 
					|| userEntry.charAt(i) == 'L' || userEntry.charAt(i) == 'l' 
					|| userEntry.charAt(i) == 'M' || userEntry.charAt(i) == 'm' 
					|| userEntry.charAt(i) == 'N' || userEntry.charAt(i) == 'n' 
					|| userEntry.charAt(i) == 'O' || userEntry.charAt(i) == 'o' 
					|| userEntry.charAt(i) == 'P' || userEntry.charAt(i) == 'p' 
					|| userEntry.charAt(i) == 'Q' || userEntry.charAt(i) == 'q' 
					|| userEntry.charAt(i) == 'R' || userEntry.charAt(i) == 'r' 
					|| userEntry.charAt(i) == 'S' || userEntry.charAt(i) == 's' 
					|| userEntry.charAt(i) == 'T' || userEntry.charAt(i) == 't' 
					|| userEntry.charAt(i) == 'U' || userEntry.charAt(i) == 'u' 
					|| userEntry.charAt(i) == 'V' || userEntry.charAt(i) == 'v' 
					|| userEntry.charAt(i) == 'W' || userEntry.charAt(i) == 'w' 
					|| userEntry.charAt(i) == 'X' || userEntry.charAt(i) == 'x' 
					|| userEntry.charAt(i) == 'Y' || userEntry.charAt(i) == 'y' 
					|| userEntry.charAt(i) == 'Z' || userEntry.charAt(i) == 'z' 
					) {
				// error message
				System.out.println("Integer value cannot contain letters. "
						+ "Goodbye! ");
				// exit loop
				i = userEntry.length();
				// we went through the loop
				wentThroughAlphabetLoop = true;
			}
		}
	
		// echo user input
		if (!userEntry.isEmpty() && !wentThroughAlphabetLoop) {
			System.out.println("You entered: " + userEntry);
		}

		// print out if number is negative; intInput is the result
		if (userEntry.charAt(0) == '-' && !wentThroughAlphabetLoop) { 
			System.out.println("We see you've entered a negative number. ");
			Scanner parseNegative = new Scanner(userEntry);
			if (parseNegative.hasNextDouble()) {
				// in case of decimal inputs
				if (userEntry.charAt(0) == '-') {
					doubleInput = parseNegative.nextDouble();
					wentThroughNegativeLoop = true; 
					intInput = (int) doubleInput;
				}
				// if no decimal input 
				// unreachable
				else if (parseNegative.hasNextInt()) {
				intInput = parseNegative.nextInt(); 
				System.out.println(intInput);
				}
				parseNegative.close();
			}
			else {
				System.out.println("Something went wrong... we think it was"
						+ " the sloths. Please try again. Goodbye!");
			}
		}
		// print out if number is positive; intInput is the result
		else if (userEntry.codePointAt(0) > 0 && !wentThroughAlphabetLoop 
				&& !userEntry.contains(".")) {
			System.out.println("We see you've entered "
					+ "a nonnegative number. ");
			Scanner parsePositive = new Scanner (userEntry);
			if (parsePositive.hasNextInt()) {
				intInput = parsePositive.nextInt(); 
			}
			else {
				System.out.println("Something went wrong... we think it was "
						+ "the monkeys. Please try again. Goodbye!");
				System.exit(0);
			}
			parsePositive.close();
		} 
		// print out if user entered a double; intInput is result
		if (userEntry.contains(".") && !wentThroughAlphabetLoop) {
			Scanner parseStuff = new Scanner(userEntry);
			if (parseStuff.hasNextDouble()) { 
				System.out.println("You have entered a decimal value. Your "
						+ "value will be rounded up to the next "
						+ "highest integer. ");
				if (wentThroughNegativeLoop = true) {
					doubleInput-=1; 
					intInput = ((int) doubleInput + 1);
					System.out.println("Your number is: "+ intInput);
				}
				else {
				doubleInput = parseStuff.nextDouble();
				intInput = ((int) doubleInput + 1);
				System.out.println("Your number is: "+ intInput);
				}
				parseStuff.close(); 
			}
			
		} System.out.println("Your number incremented by 1 is: " + intInput);
		scnr.close();
	} 
}
