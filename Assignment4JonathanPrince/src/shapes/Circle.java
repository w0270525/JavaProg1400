package shapes;

import java.awt.Color;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends Shapes {
	private int shapeHeight;
	private int shapeWidth;
	private int morph = 1;

	public Circle(int xPos, int yPos, int width, int height) {
		setShapeHeight(height);
		setShapePositionX(xPos);
		setShapePostionY(yPos);
		setShapeWidth(width);

		setMovementX(2);
		setMovementY(2);
	}

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		int x = getShapePositionX();
		int y = getShapePostionY();
		int height = getShapeHeight();
		int width = getShapeWidth();

		Ellipse2D circle = new Ellipse2D.Double(x, y, width, height);
		
	    return circle;
	}

	/* overrides to allow circle to change size. */
	@Override
	public int getShapeHeight() {
		int multiplier = -1;

		if (shapeHeight >= 50 || shapeHeight <= 15) {
			morph = morph * multiplier;
			shapeHeight = shapeHeight + morph;
		} else {
			shapeHeight = shapeHeight + morph;

		}

		return shapeHeight;
	}

	@Override
	public void setShapeHeight(int shapeHeight) {
		this.shapeHeight = shapeHeight;

	}

	@Override
	public int getShapeWidth() {

		shapeWidth = shapeHeight;
		return shapeWidth;
	}

	@Override
	public void setShapeWidth(int shapeWidth) {
		this.shapeWidth = shapeWidth;
	}

	@Override
	public Color shapeColor() {
		// TODO Auto-generated method stub
		Color color = new Color(0, 0, 244);
		return color;
	}

	
	
}// bottom

