package dnd;

import java.util.Random;

public class Weapon {
	private String weaponName;
	private int minDamage;
	private int maxDamage;
	
	
	public Weapon(String weaponName, int minDamage, int maxDamage) {
		this.setWeaponName(weaponName);
		this.minDamage =  minDamage;
		this.maxDamage =  maxDamage;
		
		
			
		}
	public int hitDamage() {
		Random roll = new Random();
		int damageRoll=roll.nextInt(2)+1;
		if (damageRoll == 1) 
		{
			return minDamage;
		}
		else 
		{
			return maxDamage;
		}
	}
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

}
