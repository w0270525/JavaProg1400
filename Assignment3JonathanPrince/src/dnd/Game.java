package dnd;

import java.util.ArrayList;
import java.util.Random;

import dnd.Character;
import dnd.Rogue;
import dnd.Warrior;
import dnd.Weapon;
import dnd.Wizard;

public class Game {

    // declaring like a million variables.

    private Random roll;
    private int eCharacterType = 0;
    private int eWeapon = 0;
    private int eArmor = 0;
    private Character playerCharacters;
    private Character enemyCharacters;
    private Weapon playerWeapons;
    private Weapon enemyWeapons;
    private Armor playerArmors;
    private Armor enemyArmors;
    private ArrayList<String> battleText;

    public Game(int characterType, int weapon, int armor) {

	// initializing variables

	// holy hell i had no idea what i was doing when i was making this.
	Weapon tempWeapon = new Weapon("dumb", 0, 1);
	switch (weapon) {
	case 0: {
	    tempWeapon = new Weapon("Axe", 4, 7);
	    break;
	}
	case 1: {
	    tempWeapon = new Weapon("Sword", 3, 8);
	    break;
	}
	case 2: {
	    tempWeapon = new Weapon("Mace", 5, 6);
	    break;
	}
	default: {
	    System.out.println("Jonathan you goofed again.");
	}

	}

	switch (characterType) {
	case 0: {
	    playerCharacters = new Warrior("Warrior", tempWeapon);
	    break;
	}
	case 1: {
	    playerCharacters = new Rogue("Rogue", tempWeapon);
	    break;
	}
	case 2: {
	    playerCharacters = new Wizard("Wizard", tempWeapon);
	    break;
	}

	}

	//
	// playerCharacters = new Character;
	// enemyCharacters = new Character;
	// playerWeapons = new Weapon[3];
	// enemyWeapons = new Weapon[3];
	// playerArmors = new Armor[3];
	// enemyArmors = new Armor[3];
	//
	// EnemyCharacter(eCharacterType, eWeapon, eArmor);
	//
	// playerCharacters = new Warrior("Warrior");
	// playerCharacters = new Rogue("Rogue");
	// playerCharacters = new Wizard("Wizard");
	//
	// enemyCharacters = new Warrior("Warrior");
	// enemyCharacters = new Rogue("Rogue");
	// enemyCharacters = new Wizard("Wizard");
	//
	// playerWeapons = new Weapon("Axe", 4, 6);
	// playerWeapons = new Weapon("Sword", 2, 8);
	// playerWeapons = new Weapon("Mace", 5, 5);
	//
	// enemyWeapons = new Weapon("Axe", 4, 6);
	// enemyWeapons = new Weapon("Sword", 2, 8);
	// enemyWeapons = new Weapon("Mace", 5, 5);

	// generate an enemy.
	EnemyCharacter();

	// Start the battle with the character with selected character and
	// random enemy.
	doBattle();

    }

    // rolls to determine enemy character
    private void EnemyCharacter() {

	roll = new Random();
	int characterRoll = roll.nextInt(3);

	switch (characterRoll) {
	case 0: {
	    eCharacterType = 0;// war
	}
	case 1: {
	    eCharacterType = 1;// rogue
	}
	case 2: {
	    eCharacterType = 2;// wizard
	}

	}
	characterRoll = roll.nextInt(3);
	switch (characterRoll) {
	case 0: {
	    eWeapon = 1;// axe
	}
	case 1: {
	    eWeapon = 2;// sword
	}
	case 2: {
	    eWeapon = 3;// mace
	}

	}
	characterRoll = roll.nextInt(3);
	switch (characterRoll) {
	case 0: {
	    eArmor = 0;// leather
	}
	case 1: {
	    eArmor = 1;// chain
	}
	case 2: {
	    eWeapon = 2;// plate
	}

	}

    }

    private void doBattle() {
	battleText = new ArrayList<>();
	battleText.add("A new challenger approaches: Player against the Champion.");
	int turn = 1;
	while (playerCharacters.getHealth() <= 0 || enemyCharacters.getHealth() <= 0) {
	    if (turn == 1) {
		Attack(playerCharacters, enemyCharacters);
	    } else {

		Attack(enemyCharacters, playerCharacters);
	    }

	    // alternates plyaer and enemy turn
	    turn = turn * -1;
	}

    }

    private void Attack(Character char1, Character char2) {
	int dam = char2.getArmorPoints() - char1.getDamage();
	int newHealth = 0;
	if (dam > 0) {
	    newHealth = char2.getHealth() - (char2.getArmorPoints() - char1.getDamage());
	}
	char2.setHealth(newHealth);

    }

    // way to spit back the battleText.
    public ArrayList<String> getBattleText() {
	return battleText;
    }

    // try here for doing output?
}