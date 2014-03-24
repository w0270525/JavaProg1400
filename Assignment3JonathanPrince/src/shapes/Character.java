package shapes;



public abstract class Character {
	
	private double health = 100;
	private int damage;
	private int armorPoints;
	
	public abstract double damageModifier();
	
	public abstract int healthPoints();
	
	
}
