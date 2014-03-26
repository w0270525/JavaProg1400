package shapes;
import Employee;

import java.util.*;

import javax.swing.JTextArea;

import shapes.Rogue;
import shapes.Warrior;
import shapes.Wizard;
import shapes.Weapon;
import shapes.Character;
import shapes.CharacterSheet;

public class Game {
 
	public Game(int characterType, int weapon, int armor)	{
	int eCharacterType = 0;
	int eWeapon = 0;
	int eArmor = 0;
	
	final Character[] playerCharacter = new Character[3];
	final Character[] enemyCharacter = new Character[3];
	ArrayList<String> battleText  = new ArrayList<String>();
		
	EnemyCharacter(eCharacterType, eWeapon, eArmor);
	
	
	playerCharacter[1] = new Warrior();
	playerCharacter[2] = new Rogue ();
	playerCharacter[3] = new Wizard();
	
	enemyCharacter[1] = new Warrior();
	enemyCharacter[2] = new Rogue ();
	enemyCharacter[3] = new Wizard();
	
	
	
	}
// rolls to determine enemy character
	private void EnemyCharacter(int eCharacterType, int eWeapon, int eArmor) {
	
		Random roll = new Random();
		int characterRoll = roll.nextInt(3)+1;
		
		switch(characterRoll)
		{
			case 1:
			{
			eCharacterType = 1;//war
			}
			case 2:
			{
				eCharacterType = 2;//rogue
			}
			case 3: 
			{
				eCharacterType= 3;//wizard
			}
			
		}
		characterRoll = roll.nextInt(3)+1;
		switch(characterRoll)
		{
			case 1:
			{
			eWeapon = 1;//axe
			}
			case 2:
			{
				eWeapon = 2;// sword
			}
			case 3: 
			{
				eWeapon = 3;//mace
			}
			
		}
		characterRoll = roll.nextInt(3)+1;
		switch(characterRoll)
		{
			case 1:
				{
				eArmor = 1;// leather
				}
			case 2:
				{
				eArmor = 2;//chain
				}
			case 3: 
				{
				eWeapon = 3;//plate
				}
			
		}
	}


}