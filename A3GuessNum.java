/*
*Name: Talia Moffat
*Date: November 23rd, 2021 - 
*Desription: Computer generates a random number between 1 and 100
which user has 5 attempts to guess with hints given after each guess.
*/

import java.util.*;

public class A3GuessNum{
  
  
  //main method
  public static void main(String[] arg){

    System.out.println("\nHi! Welcome to The Great Number Guessing Game!");
    System.out.println("\nShould you dare to play...");
    System.out.println("\nYou will have to guess a random number inside a range of numbers that is different each game.");
    System.out.println("You will have a limited number of guesses with hints after each guess you get wrong.");
    System.out.println("\nDo you dare to play?");
    System.out.println("\nPlease enter 'y' for Yes or 'n' for No");
    // New scanner, scan for input here, if statement after check for invalid input
    // No = output "No? Well okay, come back soon!" end program
    // Yes = output "Excellent, might I know the name of my challenger?"
    // new scanner (scanner method?) scan for string. check for validity
    // output "Hi ______!"

    // Start of a loop
    // Are you ready to make your first guess?
    //"\nPlease enter 'y' for Yes or 'n' for No"
    // scanner
    // no = jump to previous no response (make a 'no' method?)
    // yes = "Okay, I'm ready. Guess a number between _ and _."
    // need to generate a (reasonable) range 

    // scanner and check for invalid input (out of range) (method?)
    // High or low then then "Nope- " Hot, Warm, Cold, Freezing 
    // guess again loop (say how many guesses left)
    // got it = end game/round
    // out of guesses = end of game/round

    // ask play again, if yes, 
    // loop back to are you ready to make your first guess

    // Make a scanner and Random Object.
    Scanner input = new Scanner(System.in);
    Random numGenerator = new Random();
    
    // Declaring answer, guess, and counter variables.
    // Generates a random number from 0-99 inclusive, plus one makes it 1-100 inclusive.
    int answer = numGenerator.nextInt(100) + 1;
    int guess = -1; // default guess num. to make loop work (-1 will never be right).
    int i = 0; // declare counter for loop.
    
    while (guess != answer && i < 5){
      System.out.println("\nGuess a number");
      guess = input.nextInt();  
      i++;
    }
    if (guess == answer){
      System.out.println("\nWow, you got it!");
    }
    else {
      System.out.println("\nSorry, you're out of guesses.");
    }
      
  }// close main
}
