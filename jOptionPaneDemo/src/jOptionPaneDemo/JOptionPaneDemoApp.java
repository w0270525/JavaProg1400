package jOptionPaneDemo;

//could import JOptionPane

import javax.swing.JOptionPane;

public class JOptionPaneDemoApp {
	public void start()
	{
		// Class itself has methods that you can run, similar to MessageBox.show in VB.
		
		JOptionPane.showMessageDialog(null, "Hello Message Dialog!");
		
		String input = JOptionPane.showInputDialog("Please say anything");
		
		JOptionPane.showMessageDialog(null, input);
		
		int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?");
		
		JOptionPane.showMessageDialog(null, "You chose " + response);
		
		
		// switch is similar to Select Case in VB
		switch(response)
			{
				case JOptionPane.YES_OPTION:
				{
					JOptionPane.showMessageDialog(null, "You Clicked Yes");
					break;
				}
				case JOptionPane.NO_OPTION:
				{
					JOptionPane.showMessageDialog(null, "You Clicked No");
					break;
				}
				case JOptionPane.CANCEL_OPTION:
				{
					JOptionPane.showMessageDialog(null, "You Clicked Cancel");
					break;
				}
			}
	
		}

}
