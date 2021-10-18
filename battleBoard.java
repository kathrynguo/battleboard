import java.util.Scanner;

public class battleBoard {
	//array() prints the arrray with letters and numbers labelling the sides
	public void array() {
		char c;
		int a = 64;
		int[][] numbers = new int[10][10];
		System.out.println("   1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				if (j == 0) {
					a = a + 1;
					c = (char)a;
					System.out.print(c + "  ");
				}
				if else (j == 0 || j % (numbers.length - 1) != 0) {
					System.out.print(numbers[i][j] + " ");
				}
				else {
					System.out.println(numbers[i][j] + " ");
				}
			}
		}
	} // closes array()

	//rule() states the rules of the game
	public void rules() {
		System.out.println("\nRules: ");
		System.out.println("You get 5 ships to place. You have 1 5 length ship, 1 4 length ship, 2 3 length ships, and 1 2 length ship.");
		System.out.println("You will choose where to place each ship either horizontally and verticallly, no diagonally.");
	}

	//Kathyrn's thing stating ship placement
	public void shipPlacement() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nWhere would you like to place your 5 length ship?  Please type in every position you like to place it in (Ex. A1, A2, A3, A4, A5)");
	}
}
