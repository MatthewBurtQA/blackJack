package com.qa.main;
import java.lang.Math;

public class Blackjack {
	
	//hand rules : no limit on card amount hand can contain
	// if hand Sum != 21, allow draw of card
	// if hand sum == 21, 
	// stop looking at my code, or i'll eat your legs and ask you to run a marathon >:( 
	
	public int[] hand(){
		
		int[] playerHand = new int[10]; // declare int array, length of 2
		
		int sum = 0;
		int totalLoops = 0;
		int min = 1; int max = 11;
		System.out.println("Drawing a hand now!");
	
		while(sum <=21){
		
			
			for (int i=0; i < playerHand.length; i++){ //search thru the players hand. 
				
				sum = sum + playerHand[i]; // this line needs editing. WAIT WAIT ARRAY.LENGTH
				
				if (sum >21){
					
					System.out.println("ya just went bust kiddo, hand over the chips, im eating them for dinner");
					System.out.println("You ended on: " + sum);
					System.exit(0);
					break;
				}
				if (sum == 21){
					System.out.println("YOU JUST HIT 21 YOU WIN OHHHHHHHHHHHHBOY $$$ BIG MONEY BIG PRIZES $$$");
					System.exit(0);
					break;
					
				}
			}
			//System.out.println("Total in players hand is: " + sum);

			

			if (sum <= 21){
				System.out.println("Drawing a card...");
				playerHand[totalLoops] = (int)(Math.random() * (max - min) + min);
				System.out.println("Just drawn a " + playerHand[0]);
				//int lastSum = playerHand[0]; //
				//int arrayLengthCheck = playerHand.length -1;
				//System.out.println("Just drawn a" + playerHand[arrayLengthCheck]);
				totalLoops++;	
			}
			//System.out.println("Total in players hand is: " + sum);


			System.out.println("Time to draw another card...");
			
		
		}
		return playerHand;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blackjack newGame = new Blackjack();
		newGame.hand();
	}

}
