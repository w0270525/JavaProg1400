package dnd;

import java.util.Random;

public class Wizard extends Character {

	public Wizard(String Name, Weapon weapon) {
		super(Name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int damageModifier() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int healthPoints() {
		// TODO Auto-generated method stub
		return 100;
	}
	public int getDamage() {
		Random damageRoll = new Random();
		int roll = damageRoll.nextInt(20) +1;
		if( roll > 15)//double damage for 20
		{
			return 2;
		}
		else if(roll > 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	

}
