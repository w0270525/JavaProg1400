package examples;

public class Tire {

	private final int DIAMETER_IN_INCHES = 15;
	private int psi = 0;
	private final int MAX_PSI = 30;
	
	public int getDiameter()
	{
		return DIAMETER_IN_INCHES;
	}
	
	public void inflate()
	{
		setPsi(MAX_PSI);
	}

	public int getPsi() {
		return psi;
	}

	public void setPsi(int psi) {
		this.psi = psi;
	}
	
	
}
