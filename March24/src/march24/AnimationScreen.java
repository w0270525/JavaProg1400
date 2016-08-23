package march24;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationScreen extends JPanel {
//need for assignment
	private Timer timer = new Timer(33, new TimerAction(this));
	private BufferedImage[] images = new BufferedImage[13];

	private int counter = 0;
	public AnimationScreen()
	{
		//load all images into array
		for(int i =12; i>0; i--)
		{
			try {
				images[i] = ImageIO.read(getClass().getResource(
						"animationframes/" + (i+1) + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	//need for assignment
	@Override
	public void paintComponent(Graphics g) {
		
		/* good idea to let super class do it's thing. this will wipe the 
		 * panel clean. */
		super.paintComponent(g);
		
		// gets graphics engine that is going to be drawn
		g.drawImage(images[counter], 0, 0, null);
		timer.start();//draw image then start the timer

	}

	// new timer class scope only in animation screen
	//need for assignment
	private class TimerAction implements ActionListener {
		private AnimationScreen screen;

		TimerAction(AnimationScreen screen) {
			this.screen = screen;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
//this happens ever time timer is fired again
		
			if (counter == 12) {
				counter = 0;
			} else {
				counter++;
			}

			screen.repaint();

		}
	}

}
