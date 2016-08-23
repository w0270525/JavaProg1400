package assignment1JonathanPrince;

/* Jonathan Prince 
 * Student Number W0270525
 * Assignment 1
 * Sales Commission Calculator
 *  console application
 */

import java.util.Scanner;

public class Assignment1JonathanPrinceCalculatorrefactored {

	private Assignment1JonathanPrinceCalculatorrefactored() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// constant variable declaration
		final double baseSalary = 200;
		final double itemOne = 239.99;
		final double itemTwo = 129.75;
		final double itemThree = 99.95;
		final double itemFour = 350.89;
		final double commissionPercentage = 9; // Percentage for commission

		// variables for number of items sold
		int numberSoldOne = 0;
		int numberSoldTwo = 0;
		int numberSoldThree = 0;
		int numberSoldFour = 0;

		// variables for calculation
		String employee; // keeps employees name for final earnings statement.
		double weeklyEarnings;
		String number; // holder for string before determining if entry is
						// positive integer.
		boolean nextEmployee = true;
		String userResponse;

		Scanner scanner = new Scanner(System.in);
		// Getting user input

		while (nextEmployee == true) {
			System.out.println("Please enter employee name: ");

			employee = scanner.nextLine();

			System.out.println("Please enter the number sold of item 1: ");
			number = scanner.nextLine();
			if (isInteger(number) == true) {
				numberSoldOne = Integer.parseInt(number);
			}

			System.out.println("Please enter the number sold of item 2: ");

			number = scanner.nextLine();

			if (isInteger(number) == true) {
				numberSoldTwo = Integer.parseInt(number);
			}

			System.out.println("Please enter the number sold of item 3: ");

			number = scanner.nextLine();

			if (isInteger(number) == true) {
				numberSoldThree = Integer.parseInt(number);
			}

			System.out.println("Please enter the number sold of item 4: ");

			number = scanner.nextLine();
			if (isInteger(number) == true) {
				numberSoldFour = Integer.parseInt(number);
			}

			// Calculation for employees weekly earnings. base salary plus
			// commission at 9% of items sold.
			weeklyEarnings = baseSalary
					+ (((itemOne * numberSoldOne) + (itemTwo * numberSoldTwo)
							+ (itemThree * numberSoldThree) + (itemFour * numberSoldFour))
								* (commissionPercentage / 100));

			// String.format( "%.2f", x) found by google search, unsure if this
			// is what is required or using a currency import.
			System.out.println("The weekly salary for " + employee + " is $"
					+ String.format("%.2f", weeklyEarnings) + ".");

			// Option to continue with another employee. y sends true and
			// continues through loop, n sends false and exits.
			System.out
					.println("Would you like to enter another employee? [Y/N]: ");

			userResponse = scanner.nextLine();
			if (userResponse.equals("n") || userResponse.equals("N")) {
				nextEmployee = false;
			}

		} // loop
		scanner.close();

	}

	static boolean isInteger(String number) {

		if (Integer.parseInt(number) < 0) {

			System.out.println("Invalid response");
			return false;
		} else
			return true;

	}

	public static Object createAssignment1JonathanPrinceCalculator() {
		return new Assignment1JonathanPrinceCalculatorrefactored();
	}
}
