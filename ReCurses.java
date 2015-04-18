///////////////////////////////////////////////////////////////////////////////
//						MADHACKS 2015
//			Main Class:		 IncremintyMain.java
//			This File: 		 ReCurses.java
//			Hackers: 		Jessie Demers && Megan Tanksley
//
///////////////////////////////////////////////////////////////////////////////
public class ReCurses {

	//methods
	//Recursively break apart and add up to the number
	public static int ReCurse(int number) {
		//if the number is 0, return 0
		if (number <= 0) {
			return 0;
		}
		//if the number is more than 100, reduce by 100 and return
		if (number > 100) {
			return 100 + ReCurse(number - 100);
		}
		return 1 + ReCurse(number - 1);
	}
	
	//if number is negative, use ReCurseNeg instead
	public int ReCurseNeg(int number) {
		number = number * -1;
		return -1 * ReCurse(number);
	}
}
