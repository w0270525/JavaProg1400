package shapes;

public class Square extends Shapes {
	
	private double radius;
	@Override
	public double calculateArea() {
	// PI * radius squared
		
		return Math.PI * (radius * radius);
		
	}

}
