package assignment2JonathanPrince;

/*
 * author: Jonathan Prince
 * title: Assignment 2 
 * notes: Airline Java Project
 */

import javax.swing.JOptionPane;

public class Assignment2 {
	
	// Rows and columns for flight booking seating, and array for flight booking.
	final int ROWS = 4;
	final int COLUMNS= 4;
	int[][] flightSeating = new int[ROWS][COLUMNS];
		
	
	public void start()
	{
		// to get program started.
		opening();
	}
	

	public void opening()
	{
		int newBooking = 0;
		// Start of booking process with seating arraignment.
		String s1= "<html><body><table>";
		
		
				
		String s4= "</table></body></html>";
		
		Object[] options = {"Book a New Passenger",
		                    "Exit"};
		newBooking = JOptionPane.showOptionDialog(null, "Welcome to the Flight Booker", "Flight Booker",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, newBooking);
		
		if(newBooking == 0)
		{
			booking();
		}
	
	}

	public void booking()
	{
		int chosenClass = 0;
				
		Object[] options2 = {"First Class", "Economy"};
		chosenClass = JOptionPane.showOptionDialog(null, "Would you like First Class or Economy Class?",
				"Select a Class", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, chosenClass);
		
				
				//(null, "Would you like First Class or Economy Class?", "Select a Class", JOptionPane.YES_NO_OPTION, options2, options2, chosenClass);
	}

	public static String checkSeating(int seat) {
		// checks if seating is empty returning red or full returning green.
		if(seat == 1)
		{
			return "'green'";
		}
		else
		{
			return "'red'";
		}
	}
	
	public static String seatingTable(int seatingArray)  {
		
	}
}

