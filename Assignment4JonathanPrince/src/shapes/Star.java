package shapes;

import java.awt.Graphics2D;
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
	public Shape getShape() {
		// TODO Auto-generated method stub
		GeneralPath star = new GeneralPath();
		int xValues[] = { 0, 100, 0, 100 };
		int yValues[] = { 0, 100, 100, 0 };

		// define the general path

		star.moveTo(xValues[0], yValues[0]);

		// looping through the rest of the x and y values
		for (int i = 1; i < xValues.length; i++) {
			star.lineTo(xValues[i], yValues[i]);
		}
		star.closePath();
		// draw for lines or fill for solid
		
		return star;
	}

}
