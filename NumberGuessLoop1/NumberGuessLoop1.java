
/**
 * This program is a number-guessing game, which
 * reads in user's guess and give hints
 */

import java.io.*;
import java.util.Scanner;

public class NumberGuessLoop1{
	final static int STORED_NUMBER = 22;
	
	
	/* This is a do-while loop version */ 
	public static void main(String args[]) throws IOException {
		//variable definition and declaration
		int guess;
		char choice;
		 
		do {
			System.out.println("Please enter your guess: ");
			/* old way to get user's input
			//Get user's guessed number and store it into a string.
			BufferedReader in;
			in = new BufferedReader(new InputStreamReader (System.in));
			String inputString = in.readLine();
			
			//convert the number from a String type to an int type
			guess = Integer.parseInt(inputString);
			*/
			
			//New way to get user's input
			Scanner stdIn = new Scanner(System.in);
			guess = stdIn.nextInt();
			
			if (guess == STORED_NUMBER)	//guess is right
			{
				System.out.println("Correct! Good Bye!");
				break;
			}
			else  //guess != STORED_NUMBER
			{
				if (guess < STORED_NUMBER)	//guess is too low
					System.out.println("Too low!");
				else						//remaining cases: guess is too high
					System.out.println("Too high!");
			}
			
			System.out.println("Would you like to make another guess? (Y/N)");
			/*old way to get user's input
			inputString = in.readLine();
			choice = inputString.charAt(0); //get the first character in user's response
			*/
			
			//New way to get user's input
			String inputString = stdIn.next();
			choice = inputString.charAt(0); //get the first character in user's response
			
		}while (choice == 'Y' || choice == 'y');
		 
	}//end of main
	
	
	/* This is a while loop version */
	/*
	public static void main(String args[]) throws IOException {
		//variable definition and declaration
		int guess;
		char choice = 'Y';
		 
		while (choice == 'Y' || choice == 'y'){
			System.out.println("Please enter your guess: ");
			
			//Get user's guessed number and store it into a string.
			BufferedReader in;
			in = new BufferedReader(new InputStreamReader (System.in));
			String inputString = in.readLine();
			
			//convert the number from a String type to an int type
			guess = Integer.parseInt(inputString);
	
			if (guess == STORED_NUMBER)	//guess is right
			{
				System.out.println("Correct! Good Bye!");
				break;
			}
			else  //guess != STORED_NUMBER
			{
				if (guess < STORED_NUMBER)	//guess is too low
					System.out.println("Too low!");
				else						//remaining cases: guess is too high
					System.out.println("Too high!");
			}
			System.out.println("Would you like to make another guess? (Y/N)");
			inputString = in.readLine();
			choice = inputString.charAt(0); //get the first character in user's response
			
		}
		 
	}//end of main
	*/
}
