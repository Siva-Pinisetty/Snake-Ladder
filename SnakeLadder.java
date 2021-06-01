package snakeladder;
import java.util.Random;
public class SnakeLadder {
public static void main(String[] args) {
	System.out.println("Welcome to Snake & Ladder Simulator");
	int position=0;
	System.out.println("Player intitial position is "+position);
	Random random = new Random();
	int Dice = random.nextInt(6)+1;
	//double Dice= Math.floor(Math.random()*10)%6+1;
	System.out.println("Dice number is "+Dice);
}
}
