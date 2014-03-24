package shapes;
import java.util.*;

public class Game {
 
	public Game(String characterType, String weapon, String armor)	{
	
		ArrayList<String> battleText=new ArrayList<String>();
		
	
		battleText.add("One");
		
		
		battleText.add("Two");
		
		battleText.add("Three");
		
		for(int i = 0; i<battleText.size(); i++)
		{
			String item = battleText.get(i);
			System.out.println("test" + item);
		}
	}


}