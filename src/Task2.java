import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

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
		int[] nums = new int[n];

		int i = 0;

		System.out.println("Enter numbers! Use 'Enter' as a delimeter: ");

		while (i < nums.length) {
			if (sc.hasNextInt()) {
				nums[i] = sc.nextInt();
				i++;
			} else {
				System.out.println("Incorrect number! Try again: ");
				sc.next();
			}

		}

		ArrayList<Integer> zeroPlace = new ArrayList<Integer>();

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == 0) {
				zeroPlace.add(j + 1);
			}

		}

		System.out.println("Output Array: " + zeroPlace);

	}

}
