package graphics;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AnimationScreen extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		drawCircle(g2d);
		drawSquare(g2d);
		drawLine(g2d);
		drawArc(g2d);
		drawFilledInRectangle(g2d);
		drawHourglass(g2d);
		drawShineyBall(g2d);
	}

	private void drawShineyBall(Graphics2D g2d) {
		int width = 200;
		int height = 200;
		Paint original = g2d.getPaint();

		// create base circle
		g2d.setColor(Color.red);
		g2d.fillOval(0, 0, 200, 200);

		// add a gradient on top
		Paint p;
		p = new GradientPaint(0, 0, new Color(0.0f, 0.0f, 0.0f, 0.4f), 0, 200,
				new Color(0.0f, 0.0f, 0.0f, 0.0f));
		g2d.setPaint(p);
		g2d.fillOval(0, 0, 200, 200);

		// add gradient highlight to the bottom
		p = new GradientPaint(0, 0, new Color(1.0f, 1.0f, 1.0f, 0.0f), 0, 200,
				new Color(1.0f, 1.0f, 1.0f, 0.4f));
		g2d.setPaint(p);
		g2d.fillOval(0, 0, 200, 200);

		// create some dark edges for 3d effect
		p = new RadialGradientPaint(new Point2D.Double(width / 2.0,
				height / 2.0), width / 2.0f, new float[] { 0.0f, 1.0f },
				new Color[] { new Color(6, 76, 160, 127),
						new Color(0.0f, 0.0f, 0.0f, 0.8f) });

		g2d.setPaint(p);
		g2d.fillOval(0, 0, 200, 200);

	}

	private void drawHourglass(Graphics g2d) {
		// TODO Auto-generated method stub
		// Magenta
		g2d.setColor(new Color(255, 0, 255));

		// x coordinate values ( these are parallel arrays)
		int xValues[] = { 0, 100, 0, 100 };
		int yValues[] = { 0, 100, 100, 0 };

		// define the general path
		GeneralPath generalPath = new GeneralPath();

		generalPath.moveTo(xValues[0], yValues[0]);

		// looping through the rest of the x and y values
		for (int i = 1; i < xValues.length; i++) {
			generalPath.lineTo(xValues[i], yValues[i]);
		}
		generalPath.closePath();
		// draw for lines or fill for solid
		((Graphics2D) g2d).fill(generalPath);
	}

	private void drawFilledInRectangle(Graphics g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(new Color(0xFF0000));
		g2d.fillRect(100, 100, 300, 100);
	}

	private void drawArc(Graphics g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(new Color(255, 30, 0));
		g2d.drawArc(0, 100, 100, 100, 20, 333);
	}

	private void drawLine(Graphics g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(new Color(230, 0, 0));
		g2d.drawLine(100, 0, 200, 100);
	}

	private void drawSquare(Graphics g2d) {
		// TODO Auto-generated method stub
		int size = 100;
		g2d.setColor(Color.MAGENTA);
		g2d.drawRect(0, 0, size, size);
	}

	private void drawCircle(Graphics g2d) {
		// TODO Auto-generated method stub

		/* this should be used with every new drawing. */

		int size = 100;
		g2d.drawOval(0, 0, size, size);

	}
}
