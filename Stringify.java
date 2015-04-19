public class Stringify {
	//variables

	//method to finally increment our number
	public static String StringifyIt(int number) {
		//variables 
		boolean nonNegative;
		String stringify = "";		
		char incrementDigit;
		boolean finishedIncrementing = false;
		String backwards = "";
		String endResult = "";
		//establish if we need to deal with a '-' sign or not		
		if (number >= 0) {
			nonNegative = true;
		} else {
			nonNegative = false;
		}
		//convert the number to string
		stringify += number;
		if (!nonNegative) {
			stringify = stringify.substring(1);
			while (!finishedIncrementing) {
				//set incrementDigit to the last char in stringify
				incrementDigit = stringify.charAt(stringify.length() - 1);
				//sorten stringify
				stringify = stringify.substring(0, stringify.length() - 1);
				//increment the char incrementDigit
				if (incrementDigit == '0') {
					backwards += '9';

				} else if  (incrementDigit == '1') {
					backwards += '0';
					finishedIncrementing = true;
				} else if  (incrementDigit == '2') {
					backwards += '1';
					finishedIncrementing = true;
				} else if  (incrementDigit == '3') {
					backwards += '2';
					finishedIncrementing = true;
				} else if  (incrementDigit == '4') {
					backwards += '3';
					finishedIncrementing = true;
				} else if  (incrementDigit == '5') {
					backwards += '4';
					finishedIncrementing = true;
				} else if  (incrementDigit == '6') {
					backwards += '5';
					finishedIncrementing = true;
				} else if  (incrementDigit == '7') {
					backwards += '6';
					finishedIncrementing = true;
				} else if  (incrementDigit == '8') {
					backwards += '7';
					finishedIncrementing = true;
				} else if  (incrementDigit == '9') {
					backwards += '8';
					finishedIncrementing = true;
				}
			}
			//if our number is negative, put the '-' back on there
			endResult = "-";


		} else {
			//while we haven't finished incrementing our number yet, increment the
			//last relevant digit
			while (!finishedIncrementing) {
				//set incrementDigit to the last char in stringify
				incrementDigit = stringify.charAt(stringify.length() - 1);
				//sorten stringify
				stringify = stringify.substring(0, stringify.length() - 1);
				//increment the char incrementDigit
				if (incrementDigit == '0') {
					backwards += '1';
					finishedIncrementing = true;
				} else if  (incrementDigit == '1') {
					backwards += '2';
					finishedIncrementing = true;
				} else if  (incrementDigit == '2') {
					backwards += '3';
					finishedIncrementing = true;
				} else if  (incrementDigit == '3') {
					backwards += '4';
					finishedIncrementing = true;
				} else if  (incrementDigit == '4') {
					backwards += '5';
					finishedIncrementing = true;
				} else if  (incrementDigit == '5') {
					backwards += '6';
					finishedIncrementing = true;
				} else if  (incrementDigit == '6') {
					backwards += '7';
					finishedIncrementing = true;
				} else if  (incrementDigit == '7') {
					backwards += '8';
					finishedIncrementing = true;
				} else if  (incrementDigit == '8') {
					backwards += '9';
					finishedIncrementing = true;
				} else if  (incrementDigit == '9') {
					backwards += '0';
					//also deal with the next column
				}
			}
		}

		//put what's left in stringify into endResult
		endResult += stringify;
		//add whatever's in backwards in the correct order
		for (int i = 1; i < backwards.length()+1; i++) {
			endResult += backwards.charAt(backwards.length() - i);
		}
		return endResult;
	}
}
