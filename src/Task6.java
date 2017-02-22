import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = enterSize(sc);
		processArray(n);

	}

	private static int enterSize(Scanner sc) {

		int n = 0;
		boolean isInputOK = false;

		System.out.println("Enter N: ");

		while (!isInputOK) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n > 0 & n % 2 == 0) {
					isInputOK = true;
				} else {
					System.out.println("Enter correct number! ");

				}

			} else {
				System.out.println("It is not a number! Try again!: ");
				sc.next();
			}

		}
		return n;

	}

	private static void processArray(int n) {

		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == 0 | i == n - 1 | j == 0 | j == n - 1) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
			}
		}
		System.out.println("Matrix: ");
		for (int[] i : matrix) {
			for (int j : i) {

				System.out.print(String.format("%5d", j));
			}
			System.out.println();
		}
	}
}
