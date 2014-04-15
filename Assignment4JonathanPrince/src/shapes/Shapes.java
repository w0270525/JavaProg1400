package shapes;

import java.awt.Color;
import java.awt.Shape;

public abstract class Shapes {
	// Superclass for all shapes to be drawn.

	// general shape size and positions.
	private int shapeHeight;
	private int shapeWidth;

	private int shapePositionX;
	private int shapePostionY;

	private int maxWidth;
	private int maxHeight;

	private int movementX = 3;
	private int movementY = 3;

	public int getMovementX() {
		return movementX;
	}

	public void setMovementX(int movementX) {
		this.movementX = movementX;
	}

	public int getMovementY() {
		return movementY;
	}

	public void setMovementY(int movementY) {
		this.movementY = movementY;
	}

	// getters and setters for superclass shapes.
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

	// governs how shapes move.
	public void move() {

		int maxWidth = getMaxWidth();
		int maxHeight = getMaxHeight();

		int multiplier = -1;
		// will bound off walls, set to the wall if outside of the wall, fixes
		// problems with resizing.
		if (getShapePositionX() >= maxWidth) {
			setShapePositionX(maxWidth);
			movementX = movementX * multiplier;
		}
		if (getShapePositionX() <= 0) {
			setShapePositionX(0);
			movementX = movementX * multiplier;
		}
		setShapePositionX(getShapePositionX() + movementX);

		if (getShapePostionY() >= maxHeight) {

			setShapePostionY(maxHeight);
			movementY = movementY * multiplier;

		}
		if (getShapePostionY() <= 0) {
			setShapePostionY(0);
			movementY = movementY * multiplier;
		}
		setShapePostionY(getShapePostionY() + movementY);
		;

	}

	public abstract Color shapeColor();
	


	public int getMaxWidth() {
		return maxWidth;
	}

	public void setMaxWidth(int maxWidth) {
		this.maxWidth = maxWidth;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}
}
