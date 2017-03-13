package shapes;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

public class Triangle extends Shapes {
	public Triangle(int xPos, int yPos, int width, int height) {

		setShapeHeight(height);
		setShapePositionX(xPos);
		setShapePostionY(yPos);
		setShapeWidth(width);
	}

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub

		int xPosition = getShapePositionX();
		int yPosition = getShapePostionY();
		int width = getShapeWidth();
		int height = getShapeHeight();
		GeneralPath triangle = new GeneralPath();
		// assume 50x50 0,0 -25,50 25,16.6 -25,16.6 25,50
		int xValues[] = { xPosition, xPosition + (width / 2), xPosition - (width / 2) };
		int yValues[] = { yPosition, yPosition + (height / 3), yPosition + (height / 3) };
		triangle.moveTo(xValues[0], yValues[0]);

		for (int i = 1; i < xValues.length; i++) {
			triangle.lineTo(xValues[i], yValues[i]);

		}

		triangle.closePath();

		return triangle;
	}

	@Override
	public Color shapeColor() {
		// TODO Auto-generated method stub
		Color color = new Color(0, 244, 244);
		return color;
	}

}
