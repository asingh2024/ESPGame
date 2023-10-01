/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * 
 * Description: The only function this contains is main function. There are several constants in the program.
 * Such as COLOR_RED, or COLOR_BLUE because it contains final string constants. The variable are naem,describe, and date.
 * There is a scanner for input. The for loop is used games for 11 rounds. Inside the for loop a color is chose by the computer
 * and user input is used to guess the color. Switch statement is randomly taken and a while loop to make sure the user input
 * is correct. Each time the user correctly guesses the game the counter is incremented. After 11 rounds the game is over.
 * Output displays the round number and informs the user of computers selected color. Then scanner.close() to close scanner object.
 * 
 * Due: 09/12/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Amit Singh
*/


import java.util.Random;
import java.util.Scanner;

public class ESPGAME {

	public static void main(String [] args) {
		
		// final wont allow any change in the string
		
		final String COLOR_RED = "Red";
		final String COLOR_GREEN = "Green";
		final String COLOR_BLUE = "Blue";
		final String COLOR_ORANGE = "Orange";
		final String COLOR_YELLOW = "Yellow";
		final String COLOR_PURPLE = "Purple";
		final String COLOR_WHITE = "White";
		
		String name, describe, date;
		
		// Create Scanner object for input from user for name, description, and date
		Scanner scanner = new Scanner(System.in);
		
		
		// User input begins for name, description, and due dates
		System.out.println("Enter your name: ");
		name = scanner.nextLine();
		
		System.out.println("Describe your self: ");
		describe = scanner.nextLine();
		
		System.out.println("Due Date: ");
		date = scanner.nextLine();
		
		
		System.out.println("CMSC203 Assignment 1: Test your ESP Skills!");
		int correctGuess = 0; // As the correct guess goes up the number goes up
		
		
		// For loop begins. It starts with i = 1 because you can only correctly guess 11 times.
		
		for(int i =1; i <= 11; i++) {
			
			// This is to tell you each round as the loop comes up again. 
			System.out.println("Round " + i);
			
			
			// random number generator for the computer to guess
			Random random = new Random();
			int randomColor = random.nextInt(7);
			
			
			// null in computerColor does not have any number assigned to it as it goes into the switch statement
			String computerColor = null;
			String userColorGuess;
			
			
			// switch statement is used because its better than the if statement.
			// switch statement is better because it grabs the color correlated with class
			
			switch (randomColor) {
			
				case 0: computerColor = COLOR_RED;
				break;
				
				case 1: computerColor = COLOR_GREEN;
				break;
			
				case 2: computerColor = COLOR_BLUE;
				break;
				
				case 3: computerColor = COLOR_ORANGE;
				break;
				
				case 4: computerColor = COLOR_YELLOW;
				break;
				
				case 5: computerColor = COLOR_PURPLE;
				break;
				
				case 6: computerColor = COLOR_WHITE;
				break;
				
			}
			
			// After computer guessing its own color it will now ask the user what to guess
			
			System.out.println("I am thinking of a color. ");
			System.out.println("Is it Red, Green, Blue, Orange, Yellow, Purple or White");
			System.out.println("Enter your guess?");
			
			
			// this is gets the user input
			Scanner userGuess = new Scanner(System.in);
			userColorGuess = userGuess.next();
			
			
			// while loop is used to because you want the game to keep going and the game doesnt end.
			// while loop also going to make sure the correct color names are being used
			// ! exlimation point is to make sure they are entering the correct color. 
			while (!userColorGuess.equalsIgnoreCase(COLOR_RED) && !userColorGuess.equalsIgnoreCase(COLOR_GREEN) && 
					!userColorGuess.equalsIgnoreCase(COLOR_BLUE) &&
					 !userColorGuess.equalsIgnoreCase(COLOR_ORANGE) &&
					!userColorGuess.equalsIgnoreCase(COLOR_YELLOW) && !userColorGuess.equalsIgnoreCase(COLOR_PURPLE)
					&& !userColorGuess.equalsIgnoreCase(COLOR_WHITE)){
				
				// this it to make sure the user input enters the correct colors or else you ahve to try again.
				System.out.println("You entered incorrect color. It is Red, Green, Blue, Orange, or Yellow?");
				
				System.out.println("Enter your guess again:");
				Scanner userAgainGuess = new Scanner(System.in);
				
				userColorGuess = userAgainGuess.next();
				
			}
			
			// as you get out of the while loop your still in the forloop of the program. 
			// now your going to put what the computer was thinking 
			System.out.println("I was thinking of " + computerColor);
			
			// if user input matches with the computer's guess then correctGuess add 1 to the correctGuess
			// Until it reaches 11
			if(userColorGuess.equalsIgnoreCase(computerColor)){
				correctGuess++;
			}
			
			// once it has reached 11 the game is over.
			if(i == 11) {
				System.out.println("Game Over");
			}
			
		}
		
		// this prints out th correct guess and and user inputs from the beginning of the program.
		System.out.println("You guess " + correctGuess + " out of 10 correctly");
		System.out.println("User Name: " + name);
		System.out.println("User Description: " + describe );
		System.out.println("Due Date: " + date);
		
		
		scanner.close();
		
}
}








