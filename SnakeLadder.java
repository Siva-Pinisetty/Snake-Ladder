package snakeladder;
import java.util.Random;
public class SnakeLadder {
public static void main(String[] args) {
	System.out.println("Welcome to Snake & Ladder Simulator");
	int position=0;
	Random random = new Random();
	while(position<100)
	{
		int Dice = random.nextInt(6)+1;
		System.out.println("Dice number is "+Dice);
		int Option = random.nextInt(3);
		//System.out.println("Dice number is "+Option);
		if (Option == 0)
		{
			System.out.println("No play");
		}
		else if (Option == 1)
		{
			System.out.println("Ladder and add to position");
			position+=Dice;
			if (position > 100)
			{
				position-=Dice;
			}
		}
		else
		{
		System.out.println("Snake and subtract from position");
		position-=Dice;
			if (position < 0)
			{
				position=0;
			}
		}
		System.out.println("Position of player is "+position);
	}
}
}
