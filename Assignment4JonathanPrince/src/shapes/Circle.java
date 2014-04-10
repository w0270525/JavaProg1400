package shapes;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Shapes {
	public Circle(int xPos, int yPos, int width,  int height) {
		setShapeHeight(height);
		setShapePositionX(xPos);
		setShapePostionY(yPos);
		setShapeWidth(width);
	}
	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		int x=getShapePositionX();
		int y=getShapePostionY();
		int height= getShapeHeight();
		int width = getShapeWidth();
		
		Ellipse2D circle = new Ellipse2D.Double(x, y, width, height);
		
		return circle;
	}

}
