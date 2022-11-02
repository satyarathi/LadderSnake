package com.day.four;
import java.util.Random;

public class LadderSnake {

	public int Diceroll()
	{
	    int num = 0;
	    Random dr = new Random();
	    num = dr.nextInt(7);
	    if (num == 0) {
	    	num++;
	    }
	    System.out.println("Dice value:" +num);
	    return (num);
	    
	}
	public static void main(String[] args) {
		System.out.println("Position starts at 0");
		
		//diceroll
		LadderSnake n = new LadderSnake();
		n.Diceroll();
	}
}
