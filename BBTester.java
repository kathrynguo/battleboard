import java.util.Scanner;

public class BBTester {
	public static void main (String[] args) {
		battleBoard myStand = new battleBoard();
		Scanner keyboard = new Scanner(System.in);
		int a = 1;
		int b = 1;
		int gameNum = 1;
    // line 11- 30 is opening game function
		System.out.println(" ");
		System.out.println("Welcome to Battle Board!");
		System.out.println("Would you like to play?");
		System.out.print("Yes or No : ");
		String welcome = keyboard.nextLine();
		while ( a == 1) {
			if (welcome.equals("Yes") || welcome.equals("yes")) {
				System.out.println("\nGame 1: \n");
				myStand.array();
				myStand.rules();
				myStand.shipPlacement();
				a = 0;
			else if (welcome.equals("No") || welcome.equals("no")) {
				System.out.println("Ok! See you next time!");
				a = 0;
			}
			else {
				System.out.println("Please type Yes or No.");
				a = 1;
			}
		}
	}
}
