package shapes;

import java.awt.Color;

import java.awt.Shape;
import java.awt.geom.GeneralPath;

public class Star extends Shapes {
	public Star(int xPos, int yPos, int width, int height) {

		setShapeHeight(height);
		setShapePositionX(xPos);
		setShapePostionY(yPos);
		setShapeWidth(width);
	}

	@Override
	// gets wire-frame star.
	public Shape getShape() {
		// TODO Auto-generated method stub
		GeneralPath star = new GeneralPath();
		int xPosition = getShapePositionX();
		int yPosition = getShapePostionY();
		int width = getShapeWidth();
		int height = getShapeHeight();

		// positions for a star
		int xValues[] = { xPosition, (xPosition - (width / 3)), xPosition + (width / 2), xPosition - (width / 2),
				xPosition + (width / 3) };
		int yValues[] = { yPosition, yPosition + height, yPosition + (height / 3), yPosition + (height / 3),
				yPosition + height };

		// define the general path

		star.moveTo(xValues[0], yValues[0]);

		// looping through the rest of the x and y values.
		for (int i = 1; i < xValues.length; i++) {
			star.lineTo(xValues[i], yValues[i]);
		}
		// star.lineTo(xPosition, yPosition);

		star.closePath();
		// draw for lines or fill for solid

		return star;
	}

	@Override
	public Color shapeColor() {
		// TODO Auto-generated method stub
		Color color = new Color(255, 0, 0);
		return color;
	}

}
