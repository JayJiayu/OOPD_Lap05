package lab.oodp.challenge2;

import java.util.Scanner;

//import lab.oodp.Keyboard;

/**
 * A guessing game!
 */
public class GuessingGame {

    public void start() {// TODO Write your code here.
    	Scanner s_name = new Scanner(System.in);
    	int goal = (int)(Math.random() * 101);
    	boolean time = true;
    	int sentence = 0 ;
    	
        while(time) {
        	System.out.print("Enter your guess (1 – 100): ");
        	sentence = s_name.nextInt();
        	if (sentence > goal) {
        		System.out.println("Too high, try again");
        		time = true;
        	}
        	else if (sentence < goal) {
        		System.out.println("Too low, try again");
        		time = true;
        	}
        	else if(sentence == goal){
        		System.out.println("Perfect!");
        		time = false;
        	}
        	else {
        		System.out.println("Erorr");
        	}
        }System.out.println("Good bye");    	
    }
    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        GuessingGame ex = new GuessingGame();
        ex.start();

    }
}
