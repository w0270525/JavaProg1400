package primeNumbers;

import java.util.Scanner;

public class PrimeNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare some local variables
		
		String userResponse = "";
		int number;
		int totalNumberOfPrimesFound;
		String tryAgain = "Y";
		boolean isValidResponse;
		
		Scanner scanner = new Scanner(System.in);
		// comparing strings is not = or == but .equals. java is more in terms of thinking in objects.
		while(tryAgain.toUpperCase().equals("Y"))
		{
			
			totalNumberOfPrimesFound = 0;
			isValidResponse = false;
			while(isValidResponse == false)
			{
				System.out.println("Enter a number:");
				userResponse = scanner.nextLine();
				
				if(Integer.parseInt(userResponse) <= 0)
				{
				
				System.out.println("Invalid response");
				}
				else
				{
					isValidResponse = true;
				}
				}
				
			System.out.println();
			System.out.println("Here are the numbers up to and including " + userResponse);
			
			number = Integer.parseInt(userResponse);
			userResponse = "";
			
			for(int numberToCheck = 2;numberToCheck <= number;numberToCheck++)
			{	
				if(isPrimeNumber(numberToCheck) == true)
				{
					System.out.print(numberToCheck + " ");
					totalNumberOfPrimesFound++;
				}
			}
			System.out.println();
			System.out.println("Try again? [Y/N]");
			tryAgain = scanner.nextLine();
		
			
			
			
				
		}
		scanner.close();
				
	}// end public static
	
	// Function IsPrimeNumber(number as integer) as boolean
	// void is java equivalent of a sub
	
	static boolean isPrimeNumber(int number)
	{
		double squareRootOfNumberToCheck = Math.sqrt(number);
		for(double divider=2;divider <= squareRootOfNumberToCheck; divider++)
		{
			if(number % divider == 0)
			{
				return false;
			}
		}
		
		return true;
		
	}

}
