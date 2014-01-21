package diamond;

import java.util.Scanner;

public class DiamondApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare Constants and Variables
		final String  INVALID_MESSAGE = "Invalid Entry. Please enter an odd number greater than zero: ";
		
		String userResponse = "";
		int diamondSize;
		int diamondMidpoint;
		int diamondStart;
		int diamondEnd;
		int numericResponse = 0;
		boolean isValidEntry = false;
		
		Scanner scanner = new Scanner(System.in);
		// Asking for input
		System.out.print("Enter an odd number to define the diamond size: ");
		
		while (isValidEntry == false)
		{
			userResponse = scanner.nextLine();
			numericResponse = Integer.parseInt(userResponse);
			// we'll revisit isNumeric.		
			if (numericResponse <= 0 || numericResponse % 2 != 1)
			{
				System.out.print(INVALID_MESSAGE);
			}
			else
			{
				isValidEntry = true;
			}
		}
		scanner.close();
			// Set some values to our variables
			
			diamondSize = numericResponse;
			diamondMidpoint = (diamondSize / 2) + 1;
			diamondStart = diamondMidpoint;
			diamondEnd = diamondMidpoint;
			
			// build the diamond
			
			for(int rows = 1; rows <= diamondSize; rows++)
			{
				for(int columns=1; columns<=diamondSize; columns++)
				{
					if(columns>=diamondStart && columns <= diamondEnd)
					{
						System.out.print("o");
					}
					else 
					{
						System.out.print(" ");
					}
				}
				
			}
		
		
	}

}
