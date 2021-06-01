package snakeladder;
import java.util.Random;
public class SnakeLadder {
public static void main(String[] args) {
System.out.println("Welcome to Snake & Ladder Simulator");
int player1=0,player2=0;
int count=1;
Random random = new Random();
while(player1<100 && player2<100)
{
	count++;
	int Dice = random.nextInt(6)+1;
	System.out.println("Player"+(count%2+1)+" Dice number is "+Dice);
	int Option = random.nextInt(3);
	//System.out.println("Dice number is "+Option);
	if (Option == 0)
	{
	System.out.println("No play for the player"+(count%2+1));
	}
	else if (Option == 1)
	{
		System.out.println("Ladder for the player"+(count%2+1));
		if (count%2 == 0)
		{
			player1+=Dice;
			System.out.println("His position is now "+player1);
			if (player1>100)
			{
				player1-=Dice;
				System.out.println("Since it is more than 100, his postion is"+player1);
			}
		}
		else
		{
			player2+=Dice;
			System.out.println("His position is now "+player2);
			if (player2>100)
			{
				player2-=Dice;
				System.out.println("Since it is more than 100, his postion is"+player2);
			}
		}
		count--;
	}
	else
	{
	System.out.println("Snake for the palyer"+(count%2+1));
		if (count%2 == 0)
		{
			player1-=Dice;
			System.out.println("His position is now "+player1);
			if (player1<0)
			{
				player1=0;
				System.out.println("Since it is less than 0, his postion is"+player1);
			}
		}
		else
		{
			player2-=Dice;
			System.out.println("His position is now "+player2);
			if (player2<0)
			{
				player2=0;
				System.out.println("Since it is less than 0, his postion is"+player2);
			}
		}
	}
}
System.out.println("Position of player1 is "+player1);
System.out.println("Position of player2 is "+player2);
//System.out.println("Dice rolled "+(count-1)+" times");
if (player1 == 100)
	{
		System.out.println("Player1 is winner");
	}
else
	{
		System.out.println("Player2 is winner");	
	}
}
}
