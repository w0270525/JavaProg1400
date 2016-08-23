package shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings({ "serial", "unused" })
public class Animate extends JPanel {
	
	
	// not used, was going to try to have shapes start at a random start point.
	Random random = new Random();

	// timer to repaint all shapes
	
	ArrayList<Shapes> jonsShapes = new ArrayList<Shapes>();

	private Timer timer = new Timer(50, new TimerAction());
	
	public Animate()
	{
		jonsShapes.add(new Circle(180, 25, 50, 50));
		jonsShapes.add(new CustomRectangle(100, 1, 50, 50));
		jonsShapes.add(new Triangle(35, 200, 50, 50));
		jonsShapes.add(new Star(120, 100, 50, 50));
		
	}
	
	
	// adds shapes and draws to screen.
	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		


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
	
	public void addShape()
	{
		jonsShapes.add(new Circle(180, 25, 50, 50));
	}

	// possible test for collision detection. Not implemented yet.
	/*
	  public static boolean testIntersection(Shapes shapeA, Shapes shapeB) {
	  
	  Area areaA = new Area(shapeA); areaA.intersect(new Area(shapeB)); 
	  return !areaA.isEmpty(); 
	  }
	  
	 */
}
