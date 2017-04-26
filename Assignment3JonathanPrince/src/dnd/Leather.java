/**
 * 
 */
package dnd;

import java.util.Random;;
/**
 * @author jonathan
 *
 */
public class Leather extends Armor {

	private Random r;

	/**
	 * 
	 */
	public Leather() {
		// TODO Auto-generated constructor stub
	
	r = new Random();
	}

	/* (non-Javadoc)
	 * @see dnd.Armor#DamageReduction()
	 */
	private int DamageReduction() {
		// TODO Auto-generated method stub
		int rand = r.nextInt(3);
		return rand;
	}

}
