package dnd;



public abstract class Character {
	
	
	private int health = 100;

	private int armorPoints;
	
	Weapon weapon;
	String name;
	
	
	public Character(String name, Weapon weapon) {
		this.name= name;
		this.weapon = weapon;
	}
	public abstract int damageModifier();
	
	public abstract int healthPoints();
	
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
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
