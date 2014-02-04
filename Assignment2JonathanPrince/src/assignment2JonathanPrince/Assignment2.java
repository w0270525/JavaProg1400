package assignment2JonathanPrince;

/*
 * author: Jonathan Prince
 * title: Assignment 2 
 * notes: Airline Java Project
 */

import javax.swing.JOptionPane;

public class Assignment2 {
		

		
	public void start()
	{
		opening();
	}
	

	public void opening()
	{
		int newBooking = 0;
		//
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
		Object[] options = {"First Class", "Economy"};
		JOptionPane.showOptionDialog(null, "Would you like First Class or Economy Class?", "Select a Class", JOptionPane.YES_NO_OPTION, options, null, options, initialValue)
	}

}

