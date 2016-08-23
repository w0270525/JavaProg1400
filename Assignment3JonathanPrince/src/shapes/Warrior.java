package shapes;

import java.util.Random;

public class Warrior extends Character {

	public Warrior(String Name) {
		super(Name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double damageModifier() {
		return 1.1;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int healthPoints() {
		// TODO Auto-generated method stub
		return 125;
	}
	public int getDamage() {
		Random damageRoll = new Random();
		int roll = damageRoll.nextInt(20) +1;
		if( roll > 19)//double damage for 20
		{
			return 2;
		}
		else if(roll > 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	//warrior --> 125 hp
}
