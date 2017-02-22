import java.util.Scanner;

public class Task5 {

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

		int[] nums = new int[n];
		int[][] matrix = new int[n][n];

		while (n > 0) {
			nums[n - 1] = n;
			n = n - 1;
		}

		System.out.println("Array: ");
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k] + " ");

		}
		System.out.println();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if ((i + 1) % 2 != 0) {
					matrix[i][j] = nums[j];
				} else {
					matrix[i][j] = nums[nums.length - 1 - j];
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
