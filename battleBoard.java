public class battleBoard {
	public void array() {
		int[][] numbers = new int[10][10];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				if (j == 0 || j % (numbers.length - 1) != 0) {
					System.out.print(numbers[i][j] + " ");
				}
				else {
					System.out.println(numbers[i][j]);
				}
			}
		}
	}
}
