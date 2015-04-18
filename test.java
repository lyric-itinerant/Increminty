public class test {
	public static void main(String[] args) {
//test main method to make sure calling the other methods works juuuust fine
		int number = 1234;
		IntArray intArray = new IntArray(number);
		if (number >= 0 ) {
			System.out.println(ReCurses.ReCurse(intArray.disArray()));
		} else if (number < 0) {
			System.out.println(ReCurses.ReCurseNeg(intArray.disArray()));
		}

	}
}
