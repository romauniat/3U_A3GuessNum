/*
*Name:
*Date:
*Desription:
*/

import java.util.*;

public class A3GuessNum{
  
  
  //main method
  public static void main(String[] arg){
    // Make a scanner and Random Object.
    Scanner input = new Scanner(System.in);
    Random numGenerator = new Random();
    
    // Generate a random number from 0-5.
    int answer = numGenerator.nextInt(6);
    int guess = -1; // default guess num.
    
    System.out.println("Guess a number");
    guess = input.nextInt();  
    
      
  }// close main
}
