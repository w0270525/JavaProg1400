package shapes;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class CustomRectangle extends Shapes {
	int slide;

	public CustomRectangle(int xPos, int yPos, int width, int height) {
		setShapeHeight(height);
		setShapePositionX(xPos);
		setShapePostionY(yPos);
		setShapeWidth(width);
	}

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		int x = getShapePositionX();
		int y = getShapePostionY();
		int height = getShapeHeight();
		int width = getShapeWidth();

		Rectangle2D rectangle = new Rectangle2D.Double(x, y, width, height);
		return rectangle;
	}

	@Override
	public Color shapeColor() {
		// TODO Auto-generated method stub
		int slide = 0;
		for (int i = 0; i >= 255; i++) {
			if (i >= 255) {
				i = 0;
				slide = i;
			}
			slide = i;

		}
		Color color = new Color(0, 0, slide);
		return color;
	}

}
