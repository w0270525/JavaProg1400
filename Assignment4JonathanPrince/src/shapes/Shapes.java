package shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Shapes extends JPanel {
	
	
	private Timer timer = new Timer(60, new TimerAction()); 
	
	
	
	@Override
	public void paintComponent(Graphics g) {

		
		timer.start();
	}
	
	
	
	private class TimerAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
				Shapes.this.repaint();
		}
	}
	

	
	
}