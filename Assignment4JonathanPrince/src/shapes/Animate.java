package shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings({ "serial", "unused" })
public class Animate extends JPanel {

	Random random = new Random();
	
	Circle circle = new Circle(180, 25, 50, 50);
	CustomRectangle superRectangle = new CustomRectangle(100, 70, 50, 50);
	Octagon octagon = new Octagon(35, 55, 50, 50);
	Star star = new Star(60, 75, 50, 50);

	// timer to repaint all shapes

	private Timer timer = new Timer(50, new TimerAction());

	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		ArrayList<Shapes> jonsShapes = new ArrayList<>();
		
		jonsShapes.add(superRectangle);
		jonsShapes.add(circle);
		jonsShapes.add(star);
		jonsShapes.add(octagon);
		
		int width = getWidth();
		int height = getHeight();
		for (int i = 0; i < jonsShapes.size(); i++) {

			int shapeWidth = jonsShapes.get(i).getShapeWidth();
			int shapeHeight = jonsShapes.get(i).getShapeHeight();
			jonsShapes.get(i).setMaxHeight(height - shapeHeight);
			jonsShapes.get(i).setMaxWidth(width - shapeWidth);
			
			jonsShapes.get(i).move();
			jonsShapes.get(i).getShapePositionX();
			g2d.setColor((jonsShapes.get(i).shapeColor()));
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			
			
			// Alternates solid and filled shapes.
			if (i % 2 == 0) {
				g2d.draw(jonsShapes.get(i).getShape());
			} else {
				g2d.fill(jonsShapes.get(i).getShape());
			}
		}

		timer.start();

	}


	

	private class TimerAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {

			Animate.this.repaint();
			

		}
	}
	
	// possible test for collision detection. Not implemented yet.
	/*
	public static boolean testIntersection(Shapes shapeA, Shapes shapeB) {
		   Area areaA = new Area(shapeA);
		   areaA.intersect(new Area(shapeB));
		   return !areaA.isEmpty();
		}

	*/
}
