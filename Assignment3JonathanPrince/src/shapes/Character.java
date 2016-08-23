package shapes;



public abstract class Character {
	
	private double health = 100;

	private int armorPoints;
	
	Weapon weapon;
	
	
	public Character(String Name) {
		
	}
	public abstract double damageModifier();
	
	public abstract int healthPoints();
	
	
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}

	public int getArmorPoints() {
		return armorPoints;
	}
	public void setArmorPoints(int armorPoints) {
		this.armorPoints = armorPoints;
	}
	public abstract int getDamage();
	
	
	public void setWeapon(Weapon weapon)
	{
		
	}
}
