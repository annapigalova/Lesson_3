import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = processNumberElements(sc);
		int k = processMultiple(sc);
		processArray(n, k, sc);
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

	private static int processMultiple(Scanner sc) {

		int k = 0;
		boolean isInputOK = false;

		System.out.println("Enter K: ");

		while (!isInputOK) {
			if (sc.hasNextInt()) {
				k = sc.nextInt();
				isInputOK = true;
			} else {
				System.out.println("It is not a number! Try again!: ");
				sc.next();
			}
		}
		return k;

	}

	private static void processArray(int n, int k, Scanner sc) {
		int[] nums = new int[n];

		int i = 0;

		System.out.println("Enter numbers! Use 'Enter' as a delimeter: ");

		while (i < nums.length) {
			if (sc.hasNextInt()) {
				nums[i] = sc.nextInt();
				i++;

			} else {
				System.out.println("It is incorrect number! Try again!: ");
				sc.next();
			}

		}

		int sum = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] % k == 0) {
				sum += nums[j];
			}
		}
		System.out.print("Sum of elements =  " + sum);

	}
}
