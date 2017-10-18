package dnd;

public class Sword {
    private String weaponName;
    private int minDamage;
    private int maxDamage;

    public Sword() {
    }

    public String getWeaponName() {
	return weaponName;
    }

    public void setWeaponName(String weaponName) {
	this.weaponName = weaponName;
    }

    public int getMinDamage() {
	return minDamage;
    }

    public void setMinDamage(int minDamage) {
	this.minDamage = minDamage;
    }

    public int getMaxDamage() {
	return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
	this.maxDamage = maxDamage;
    }
}