public class test {
	public static void main(String[] args) {
//test main method to make sure calling the other methods works juuuust fine
		int number = -123456789;
		int newNumber;
		IntArray intArray = new IntArray(number);
		
		//call different methods depending on if the number is negative or not
		if (number >= 0 ) {
			newNumber = ReCurses.ReCurse(intArray.disArray());
		} else {
			newNumber = ReCurses.ReCurseNeg(intArray.disArray());
		}

		System.out.println(Stringify.StringifyIt(newNumber));

	}
}
