package shapes;

import java.util.Random;

public class Rogue extends Character {

	@Override
	public double damageModifier() {
		return 1;
		
		
	}

	@Override
	public int healthPoints() {
		
		return 100;
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

	
	//rogue --> chance to back stab = instant kill.
}
