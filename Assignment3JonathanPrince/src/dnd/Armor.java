package dnd;

public abstract class Armor {

	
private abstract int DamageReduction();


public  Armor() {
		
	}

public int getDamageReduction() {
	return DamageReduction();
}
}
