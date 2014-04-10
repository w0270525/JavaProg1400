package shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Animate extends JPanel {
	Circle circle = new Circle(220, 120, 50, 50);
	CustomRectangle superRectangle = new CustomRectangle(10, 10, 50, 50);
	private Timer timer = new Timer(100, new TimerAction());
	private int counter;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		ArrayList<Shapes> jonsShapes = new ArrayList<>();

		jonsShapes.add(superRectangle);
		jonsShapes.add(circle);

		for (int i = 0; i < jonsShapes.size(); i++) {
			jonsShapes.get(i).setShapePositionX(counter);
			g2d.draw(jonsShapes.get(i).getShape());
		}

		if (counter < this.getWidth() - 50) {
			counter += 5;
		} else {
			counter = 0;
			for (int i = 0; i < jonsShapes.size(); i++) {
				int shapeYPosition = jonsShapes.get(i).getShapePostionY();
				jonsShapes.get(i).setShapePostionY(shapeYPosition + 50);
			}
		}

		timer.start();

	}

	private class TimerAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub

			int x = 0;
			int y = 0;

			y = getHeight();
			x = getWidth();

			// System.out.println(x + ", " + y);/* shows width of window
			Animate.this.repaint();

		}
	}

}
