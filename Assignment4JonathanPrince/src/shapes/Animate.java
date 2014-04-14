package shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Animate extends JPanel {
	
	
	
	
	
	Circle circle = new Circle(220, 120, 50, 50);
	CustomRectangle superRectangle = new CustomRectangle(50, 50, 50, 50);
	Octagon octagon = new Octagon(45,60,50,50);
	Star star = new Star(30, 30, 50, 50);
	private int clicked = 0; 
	
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
		for(int n=0; n < clicked; n++) {
			jonsShapes.add(superRectangle);
		}
		int width = getWidth();
		int height = getHeight();
		for (int i = 0; i < jonsShapes.size(); i++) {

			int shapeWidth = jonsShapes.get(i).getShapeWidth();
			int shapeHeight = jonsShapes.get(i).getShapeHeight();
			jonsShapes.get(i).setMaxHeight(height - shapeHeight);
			jonsShapes.get(i).setMaxWidth(width - shapeWidth);
			jonsShapes.get(i).move();
			jonsShapes.get(i).getShapePositionX();
			g2d.setColor((jonsShapes.get(i).shapeColor()));;
			
			// Alternates solid and filled shapes.
			if (i % 2 == 0) {
				g2d.draw(jonsShapes.get(i).getShape());
			} else {
				g2d.fill(jonsShapes.get(i).getShape());
			}
		}

	timer.start();

	}
	
	// mouse to add another shape 
	public void mouseClicked(MouseEvent arg0) {
		
		clicked +=1;
	}
	
	private class TimerAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Animate.this.repaint();

		}
	}
	
	

}
