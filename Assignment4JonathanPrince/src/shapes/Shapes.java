package shapes;

import java.awt.Shape;

public abstract class Shapes {
// Superclass for all shapes to be drawn.
	
	private int shapeHeight;
	private int shapeWidth;
	
	private int shapePositionX;
	private int shapePostionY;
	public abstract Shape getShape();

	public int getShapeHeight() {
		return shapeHeight;
	}

	public void setShapeHeight(int shapeHeight) {
		this.shapeHeight = shapeHeight;
	}

	public int getShapeWidth() {
		return shapeWidth;
	}

	public void setShapeWidth(int shapeWidth) {
		this.shapeWidth = shapeWidth;
	}

	public int getShapePositionX() {
		return shapePositionX;
	}

	public void setShapePositionX(int shapePositionX) {
		this.shapePositionX = shapePositionX;
	}

	public int getShapePostionY() {
		return shapePostionY;
	}

	public void setShapePostionY(int shapePostionY) {
		this.shapePostionY = shapePostionY;
	}
	
	
}
