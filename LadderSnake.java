package com.day.four;
import java.util.Random;

public class LadderSnake {

	public int Diceroll()
	{
		int diceroll = 0;

		Random dr = new Random();
		diceroll = dr.nextInt(7);
		if (diceroll == 0) {
			diceroll++;
		}
		
		System.out.println("Dice value:" +diceroll);
		return (diceroll);
	}

	//option
	public int Option()
	{
		int endposition = 100;
		int currentposition = 0; 
		int oldposition = 0;
		int newposition = 0;
		int Noplay = 0;
		int Ladder = 1;
		int Snake = 2;


		Random opt = new Random();
		int n = opt.nextInt(3);
		if (n == Noplay) 
		{
			
			System.out.println("noplay");
			

		}
		if (n == Ladder) 
		{
			System.out.println("ladder");
			do {
				System.out.println("new :"+newposition);
				newposition = newposition+Diceroll();
			}while(newposition<=100);
		
			return (Ladder);

		}
		if (n == Snake) {
			System.out.println("snake");
			do {
				System.out.println("new :"+newposition);
				newposition = newposition-Diceroll();
			}while(newposition<=100);	
			return Snake;
		}
		return n;
	}

	

public static void main(String[] args) {
	System.out.println("Position starts at 0");

	//diceroll
	LadderSnake dr = new LadderSnake();
	dr.Diceroll();

	// option
	LadderSnake j = new LadderSnake();
	j.Option();
 


}

}

