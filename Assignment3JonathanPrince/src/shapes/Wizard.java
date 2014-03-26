package shapes;

import java.util.Random;

public class Wizard extends Character {

	@Override
	public double damageModifier() {
		// TODO Auto-generated method stub
		return 0.8;
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
