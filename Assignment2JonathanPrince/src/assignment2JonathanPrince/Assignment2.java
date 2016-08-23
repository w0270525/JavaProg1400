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
	String passengerName;	
	
	public void start()
	{
		// to get program started.
		opening();
	}
	

	public void opening()
	{
		int newBooking = 0;
		// Start of booking process with seating arraignment.
		
		String htmlTable = SeatingTable(flightSeating);
		
		Object[] options = {"Book a New Passenger",
		                    "Exit"};
		newBooking = JOptionPane.showOptionDialog(null, 
				htmlTable, "Flight Booker",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
				null, options, newBooking);
		
		if(newBooking == 0)
		{
			booking();
		}
		else
		{
			System.exit(1);//quits program
		}
	
	
	}

	
	public void booking()
	{	
		boolean validName = false;
		// Capture name for ticket
				while (validName == false)
		{
			
			passengerName = JOptionPane.showInputDialog("Please enter name.");
	
			if(passengerName != null)
			{
				if(!passengerName.trim().equals("")) //checks for empty strings
				{
					
					validName = true;
				}	
				
				else
				{
					JOptionPane.showMessageDialog(null, "Error: You must type a name.");
					validName = false;
				}
			}
			else 
			{
				opening();
			}
			
		}
			
				int chosenClass = 0; // Declare Class selection variable.
		boolean openClass = false;
			
		// Class selection window
		Object[] options2 = {"First Class", "Economy"};
		chosenClass = JOptionPane.showOptionDialog(null,
				"Would you like First Class or Economy Class?",
				"Select a Class", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options2, chosenClass);
		switch(chosenClass)
		{
			case 0: // First class
			{
				openClass = checkFirstClass(flightSeating);
				if(openClass == false)
				{
					noEmptySeat();
					
				}
				break; 
			}
			case 1: // Economy class
			{
				openClass = checkEconomy(flightSeating);
				if(openClass == false)
				{
					noEmptySeat();
				
				}
				break;
			}
			case -1:
			{
				opening();
				break;
			}
		
		
		}
		// Seat Preference
		int chosenSeat = 0;
		boolean openChoice = false;
		
		Object[] options3 = {"Window Seat", "Aisle Seat"};
		chosenSeat = JOptionPane.showOptionDialog(null,
				"Would you like a window or aisle seat?", "Seat Selection",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, options3, chosenSeat);
			switch(chosenSeat) 
			{
				case 0://Window seat
				{
					openChoice = checkSeatChoice(flightSeating, chosenClass, chosenSeat);
					if(openChoice == false)
					{
						noEmptySeat();
					}
					break;
				}
				case 1:// Aisle seat
				{
					openChoice = checkSeatChoice(flightSeating, chosenClass, chosenSeat);
					if(openChoice == false)
					{
						noEmptySeat();
					}
					break;
				}
				case -1:
				{
					opening();
					break;
				}
			}
			bookTicket(flightSeating, chosenClass, chosenSeat);
			//bookTicket(int[][] seating, int classSelected, int chosenSeat)
			JOptionPane.showConfirmDialog(null, "<html><body><h3>Flight booked.</h3><br />"
					+ "Ticket Details<br />"
					+ "Customer Name: " + passengerName +"<br />"
					+ "Row: " + chosenClass
					+ "Column: " + chosenSeat);
			
			//back to start page
			opening();
	}

	


	public static String checkSeating(int seat) {
		// checks if seating is empty returning green or full returning red.
		if(seat == 1)
		{
			return "'red'";
		}
		else
		{
			return "'green'";
		}
	}
	
	public static String SeatingTable(int[][] Seating)  
	{	// code for html coding for seating.
		String str1 = "<html><body ><h3>Welcome to Flight Booker."
				+ "</h3><table align='center' cellpadding='15'>";
		//nested for loops to create tables in html
		String str2 = "";
				for(int row = 0; row < Seating.length; row++)
				{
					str2 += "<tr><td>window</td>";
					for(int col = 0; col < Seating[1].length; col++)
					{
						if(col == Seating[1].length / 2)
						{
							str2 += "<td>aisle</td>";
						}
						str2 += "<td bgcolor=" + checkSeating(Seating[row][col]) +
								">" + (row+1) + "," + (col+1) + "</td>";
						
					}
					str2 += "<td>window</td></tr>";
					
					
				}
				
		
				
		String str3 = "</table><p>Would you like to book a new flight?</p>"
				+ "</body></html>";
		
		
		return str1 + str2 + str3; // returns table for seating.
		
	}
	
	public void nextFlight()
	{
		JOptionPane.showMessageDialog(null, "The next flight is in 3 hours.");
		opening();
	}
	
	public void noEmptySeat()
	{
		int noEmpty = JOptionPane.showConfirmDialog(null, "There are no available"
				+ " seats in that selection, would you like to choose a different seat?");
		if(noEmpty == 0)
		{
			booking();
		}
		else
		{
			nextFlight();
			opening();
		}

	}
	
	public static boolean checkFirstClass(int[][] seating)
	{// checks for seats available in first class
		for(int r=0;r<seating[0].length/2;r++)
		{
		
			for(int c=0;c<seating[1].length;c++)
			{
			
				if(seating[r][c] == 0)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkEconomy(int[][] seating)
	{
		for(int r=seating[0].length/2;r<seating[0].length;r++)
		{
			for(int c=seating[1].length/2;c<seating[1].length;c++)
			{
				if(seating[r][c] == 0)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkSeatChoice(int[][] seating, int classSelected, int chosenSeat)
	{	
		if(classSelected == 0 && chosenSeat ==0) //First class and window
		{
			for(int r=0;r<seating.length/2;r++)
			{
				for(int c=0;c<seating.length;c+=seating.length-1)
				{
					if(seating[r][c] == 0)
					{
						return true;
					}
				}
			}
		}
		
		if(classSelected == 0 && chosenSeat ==1) //First class and aisle
		{
			for(int r=0;r<seating.length/2;r++)
			{
				for(int c=1;c<seating.length-1;c++)
				{
					if(seating[r][c] == 0)
					{
						return true;
					}
				}
			}
		}
		
		if(classSelected == 1 && chosenSeat == 0) //economy class and window
		{
			for(int r=seating.length/2;r<seating.length;r++)
			{
				for(int c=0;c<seating.length;c+=seating.length-1)
				{
					if(seating[r][c] == 0)
					{
						return true;
					
					}
				}
			}
		}
		
		if(classSelected == 1 && chosenSeat ==1) //economy class and aisle
		{
			for(int r=seating.length/2;r<seating.length;r++)
			{
				for(int c=1;c<seating.length-1;c++)
				{
					if(seating[r][c] == 0)
					{
						return true;
					}
				}
			}
		}
		
		return false;  //if nothing available
	}
	
	private void bookTicket(int[][] seating, int classSelected, int chosenSeat)
	{ search:
		if(classSelected == 0 && chosenSeat ==0) //First class and window
		{
			for(int r=0;r<seating.length/2;r++)
			{
				for(int c=0;c<seating.length;c+=seating.length-1)
				{
					if(seating[r][c] == 0)
					{
						flightSeating[r][c]=1;
						break search;
						
					}
				}
			}
		}
	search:
		if(classSelected == 0 && chosenSeat ==1) //First class and aisle
		{
			for(int r=0;r<seating.length/2;r++)
			{
				for(int c=1;c<seating.length-1;c++)
				{
					if(seating[r][c] == 0)
					{
						flightSeating[r][c]=1;
						break search;
					}
				}
			}
		}
	search:	
		if(classSelected == 1 && chosenSeat == 0) //economy class and window
		{
			for(int r=seating.length/2;r<seating.length;r++)
			{
				for(int c=0;c<seating.length;c+=seating.length-1)
				{
					if(seating[r][c] == 0)
					{
						flightSeating[r][c]=1;
						break search;
					}
				}
			}
		}
	search:	
		if(classSelected == 1 && chosenSeat ==1) //economy class and aisle
		{
			for(int r=seating.length/2;r<seating.length;r++)
			{
				for(int c=1;c<seating.length-1;c++)
				{
					if(seating[r][c] == 0)
					{
						flightSeating[r][c]=1;
						break search;
					}
				}
			}
		}
	}
}

