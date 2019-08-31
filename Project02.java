
/**
 * Part 1:
 * Write a program that asks the user input a change between 1 and 99 cents. 
 * The program will display it in amount of quarters, dimes, nickels, and pennies.
 *
 * Part 2: Comment away user input. Replace by code that randomly generates a change
 * between 1 and 99 cents, inclusive.
 * 
 * Catherine Schnelle
 * Project 02
 * @8/30/19
 */
import java.util.Scanner;
import java.util.Random;
public class CatherineSchnelle_Project02
{
    public static void main(String[] args)
    {
        //Scanner keyboard = new Scanner(System.in); //user keyboard input
        
        //int cents; //declare int variable cents
        
        //System.out.println("Enter a change between 1 and 99 cents:");
             
        //cents=keyboard.nextInt();
        //Takes input from keyboard, assigns the value to variable cents
        
        Random rand = new Random();
        int cents = rand.nextInt(99);
        //generate random value between 1 and 99
        
        System.out.println("You have a change " + cents +  " cents. That is:");
        //output message to user, prints total cents
        
        System.out.println((cents/25)+ "quarters");
        cents = cents % 25;
        //displays to user amount of quarters
        System.out.println((cents/10) + "dimes");
        cents = cents % 10;
        //displays to user amount of dimes
        System.out.println((cents/5) + "nickels");
        cents = cents % 5;
        //displays to user amount of nickels
        System.out.println(cents + "pennies");
        //displays to user amount of pennies
  
    }
}
