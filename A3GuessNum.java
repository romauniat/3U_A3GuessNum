/*
*Name: Tuong Luu
*Date: 23rd November, 2021
*Desription: Guessing Number
*/

import java.util.*;

public class A3GuessNum{
  
  //Create instance of Scanner and Random object
  static Scanner input = new Scanner(System.in);
  static Random rand = new Random();

  //Boolean for the game loop
  static boolean running = true;

  static int in, state, score; //int for user input and state in play() method

  //int for bound
  static int lowBound = 1;
  static int highBound = 101;

  //String for user answer
  static String ans;

  //int for user lives and the initial live user has
  static final int INITIAL_LIVE = 10;
  static int live = INITIAL_LIVE;

  //main method
  public static void main(String[] arg){
    state = 1; //set state of play() method to 1

    //game loop
    while(running) {
      play();
    }

  }// close main

  public static void play() {
    //check if state is 1 and if there is any live
    if(state == 1 && live > 0) {
      int num = rand.nextInt(highBound - lowBound) + lowBound; //generate random number
      
      int hint; //declare hint for later use
      
      //ask user for input
      System.out.print("Guess a number: ");
      check(); //call check() method

      //loop until user get the right number
      while(in != num && live > 0) {
        //if user's number is less than the generated number
        if(in < num) {
          lowBound = in;
          hint = (num-in) - ((num-in)%10);
          System.out.println("\nLives left: " + live);
          System.out.println("New range: (" + lowBound + "-" + highBound + ")");
          if(num-in >= 1 && num-in <= 10) {
            System.out.println("You are very close, just a bit higher");
          } else {
            System.out.println("You are around " + hint + " lower");
          }
          System.out.print("Enter a new number: ");
          check();
        }

        //if user's number is more than the generated number
        else if(in > num) {
          highBound = in;
          hint = (in-num) - ((in-num)%10);
          System.out.println("\nLives left: " + live);
          System.out.println("New range: (" + lowBound + "-" + highBound + ")");
          if(in-num >= 1 && in-num <= 10) {
            System.out.println("You are very close, just a bit lower");
          } else {
            System.out.println("You are around " + hint + " higher");
          }
          System.out.print("Enter a new number: ");
          check();
        }
      }

      //if wins and still has lives left
      if(in == num && live > 0) {
        System.out.println("\nCongrats! You are right");
        System.out.println("The number is: " + num);
        System.out.println("Do you want to continue?");
        score += 1;
        state = 0;
      } 
    }

    //if loses
    if(live == 0 && state == 1) {
      System.out.println("You Lose!");
      System.out.println("Do you want to continue?");
      state = 0;
    }

    //ask if user want to continue the game
    if(state == 0) {
      ans = input.nextLine();
      if(ans.equals("Yes")) {
        running = true;
        live = INITIAL_LIVE;
        state = 1;
      } else if(ans.equals("No")) {
        System.out.println("Scores: " + score);
        System.out.println("END");
        running = false;
      }
    }
  }

  //method to check for input validation
  public static void check() {
    while(!input.hasNextInt()) {
      System.out.println("That is not a number!");
      System.out.print("Please enter a number: ");
      input.next();
    }
    in = input.nextInt();
    live--;
  }
}
