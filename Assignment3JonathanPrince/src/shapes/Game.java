package shapes;
import java.util.*;

public class Game {
 
	public Game(String characterType, String weapon, String armor)	{
	String eCharacterType = null;
	String eWeapon = null;
	String eArmor = null;
	
		ArrayList<String> battleText=new ArrayList<String>();
		
	NewEnemyCharacter(eCharacterType, eWeapon, eArmor);
		
	}
// rolls to determine enemy character
	private void NewEnemyCharacter(String eCharacterType, String eWeapon, String eArmor) {
		// TODO Auto-generated method stub
		Random roll = new Random();
		int characterRoll = roll.nextInt(3)+1;
		
		switch(characterRoll)
		{
			case 1:
			{
			eCharacterType = "Wizard";
			}
			case 2:
			{
				eCharacterType = "Warrior";
			}
			case 3: 
			{
				eCharacterType="Rogue";
			}
			
		}
		characterRoll = roll.nextInt(3)+1;
		switch(characterRoll)
		{
			case 1:
			{
			eWeapon = "Axe";
			}
			case 2:
			{
				eWeapon = "Sword";
			}
			case 3: 
			{
				eWeapon = "Mace";
			}
			
		}
		characterRoll = roll.nextInt(3)+1;
		switch(characterRoll)
		{
			case 1:
				{
				eArmor = "Leather";
				}
			case 2:
				{
				eArmor = "Chain";
				}
			case 3: 
				{
				eWeapon = "Plate";
				}
			
		}
	}


}