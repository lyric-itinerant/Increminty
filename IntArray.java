///////////////////////////////////////////////////////////////////////////////
//						MADHACKS 2015
//			Main Class:		 IncremintyMain.java
//			This File: 		 IntArray.java
//			Hackers: 		Jessie Demers && Megan Tanksley
//
///////////////////////////////////////////////////////////////////////////////

public class IntArray {

	//variables
	int number;
	int[] intArray;
	boolean isNegative = false;


	//constructor
	public IntArray(int number) {
		this.number = number;
		String s = "";
		s += number;
		//check for negative number
		if (s.charAt(0) == '-') {
			//negative number
			isNegative = true;
			intArray = new int[s.length()];
		} else {
			//nonnegative number
			intArray = new int[s.length()+1];
		}

		if (!isNegative) {
			//put the number into an array, each digit in its own box
			//for example the number 123 would go into the array as
			// [1] [3] [2] [1] 
			// so that the digit in the ones place in in box 1
			for (int i = 1; i < intArray.length; i++) {
				int charToInt;
				if(s.charAt(i-1) == '0') {
					charToInt = 0;
				} else if(s.charAt(i-1) == '1') {
					charToInt = 1;
				} else if(s.charAt(i-1) == '2') {
					charToInt = 2;
				} else if(s.charAt(i-1) == '3') {
					charToInt = 3;						
				} else if(s.charAt(i-1) == '4') {
					charToInt = 4;							
				} else if(s.charAt(i-1) == '5') {
					charToInt = 5;	
				} else if(s.charAt(i-1) == '6') {
					charToInt = 6;
				} else if(s.charAt(i-1) == '7') {
					charToInt = 7;
				} else if(s.charAt(i-1) == '8') {
					charToInt = 8;
				} else {
					charToInt = 9;
				}

				intArray[intArray.length - i] = charToInt;
			}
			//the first element is 1 if positive and -1 if negative
			intArray[0] = 1;
		} else {
			s = s.substring(1);
			for (int i = 1; i < intArray.length; i++) {
				int charToInt;
				if(s.charAt(i-1) == '0') {
					charToInt = 0;
				} else if(s.charAt(i-1) == '1') {
					charToInt = 1;
				} else if(s.charAt(i-1) == '2') {
					charToInt = 2;
				} else if(s.charAt(i-1) == '3') {
					charToInt = 3;						
				} else if(s.charAt(i-1) == '4') {
					charToInt = 4;							
				} else if(s.charAt(i-1) == '5') {
					charToInt = 5;	
				} else if(s.charAt(i-1) == '6') {
					charToInt = 6;
				} else if(s.charAt(i-1) == '7') {
					charToInt = 7;
				} else if(s.charAt(i-1) == '8') {
					charToInt = 8;
				} else {
					charToInt = 9;
				}

				intArray[intArray.length - i] = charToInt;
			}
			//the first element is 1 if positive and -1 if negative
			intArray[0] = -1;
		}

		/* For testing purposes - this will print the array
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" [" + intArray[i] + "] ");
		}
		 */
	}


	//method
	public int disArray() {
		int number = 0;
		int tenPower;
		//convert the array back to our integer
		for (int i = 1; i < intArray.length; i++) {
			//reset tenPower
			tenPower = 1;
			for (int j = 1; j < i; j++) {
				//powers of ten up to i
				tenPower *= 10;

			}
			number += tenPower * intArray[i];
		}
		//make sure it is negative or positive as appropriate
		number = number*intArray[0];
		return number;
	}
}
