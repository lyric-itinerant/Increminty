import java.util.Scanner;
public class IncremintyMain {
	public static void main(String[] args) {
		//here's our scanner
		Scanner scnr = new Scanner(System.in);
		//variables
		String userEntry = "";
		
		System.out.println("Please enter an integer:");
		userEntry = scnr.next();
		System.out.println("You entered: " + userEntry);
	}
}
