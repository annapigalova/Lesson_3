import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = processNumberElements(sc);
		processArray(n, sc);
	}

	private static int processNumberElements(Scanner sc) {

		int n = 0;
		boolean isInputOK = false;

		System.out.println("Enter N: ");

		while (!isInputOK) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n > 0) {
					isInputOK = true;
				} else {
					System.out.println("Enter Positive Number! ");

				}

			} else {
				System.out.println("It is not a number! Try again!: ");
				sc.next();
			}

		}
		return n;

	}

	private static void processArray(int n, Scanner sc) {
		double[] nums = new double[n];

		int i = 0;

		System.out.println("Enter numbers! Use 'Enter' as a delimeter: ");

		while (i < nums.length) {
			if (sc.hasNextDouble()) {
				nums[i] = sc.nextDouble();
				i++;

			} else {
				System.out.println("It is incorrect number! Try again!: ");
				sc.next();
			}

		}

		boolean isAscending = true;

		for (int j = 1; j < nums.length; j++) {
			if (nums[j] < nums[j - 1]) {
				isAscending = false;
				break;
			}
		}

		if (isAscending == true) {
			System.out.println("Ascending:");
		} else {
			System.out.println("Not Ascending:");
		}

	}
}
