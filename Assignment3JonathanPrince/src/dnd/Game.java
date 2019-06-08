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

    private Random roll;;
    private Character playerCharacters;
    private Character enemyCharacters;
    private Weapon playerWeapons;
    private Weapon enemyWeapons;
    //private Armor playerArmors;
    //private Armor enemyArmors;
    private ArrayList<String> battleText;

    public Game(int characterType, int weapon, int armor) {

	// initializing variables

	// holy hell i had no idea what i was doing when i was making this.
	// I really don't know what i'm doing now, so there's that.

	switch (weapon) {
	case 0: {
	    playerWeapons = new Weapon("Axe", 4, 7);
	    break;
	}
	case 1: {
	    playerWeapons = new Weapon("Sword", 3, 8);
	    break;
	}
	case 2: {
	    playerWeapons = new Weapon("Mace", 5, 6);
	    break;
	}
	default: {
	    System.out.println("Jonathan you goofed again.");
	}

	}

	switch (characterType) {
	case 0: {
	    playerCharacters = new Warrior("Warrior", playerWeapons);
	    break;
	}
	case 1: {
	    playerCharacters = new Rogue("Rogue", playerWeapons);
	    break;
	}
	case 2: {
	    playerCharacters = new Wizard("Wizard", playerWeapons);
	    break;
	}

	}


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
	characterRoll = roll.nextInt(3);
	switch (characterRoll) {

	case 0: {
	    enemyWeapons = new Weapon("Axe", 4, 7);
	    break;
	}
	case 1: {
	    enemyWeapons = new Weapon("Sword", 3, 8);
	    break;
	}
	case 2: {
	    enemyWeapons = new Weapon("Mace", 5, 6);
	    break;
	}
	default: {
	    System.out.println("Jonathan you goofed again.");
	}

	}

	switch (characterRoll) {
	case 0: {
	    enemyCharacters = new Warrior("Evil Warrior", enemyWeapons);// warB
	    break;
	}
	case 1: {
	    enemyCharacters = new Rogue("Evil Rogue", enemyWeapons);
	    break;
	}
	case 2: {
	    enemyCharacters = new Wizard("Evil Wizard", enemyWeapons);
	    break;
	}

	}

    }

    private void doBattle() {
	battleText = new ArrayList<>();
	battleText.add("A new challenger approaches: Player against the Champion.");
	int turn = 1;
	while (playerCharacters.getHealth() >= 0 || enemyCharacters.getHealth() >= 0) {
	    if (turn == 1) {
		Attack(playerCharacters, enemyCharacters);
	    } else {

		Attack(enemyCharacters, playerCharacters);
	    }

	    // alternates player and enemy turn
	    turn = turn * -1;
	}

    }

    private void Attack(Character char1, Character char2) {
	int dam = char2.getArmorPoints() - char1.getDamage();
	int newHealth = 0;
	if (dam > 0) {
	    newHealth = char2.getHealth() - dam;
	}
	char2.setHealth(newHealth);

    }

    // way to spit back the battleText.
    public ArrayList<String> getBattleText() {
	return battleText;
    }

    // try here for doing output?
}