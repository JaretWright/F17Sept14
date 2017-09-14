
package f17sept14;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class Average {
    public static void main(String[] args)
    {
        //Prompt the user for a number
        System.out.print("Please enter a number: ");
        
        //Create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //store the number in a variable
        double firstNum = keyboard.nextDouble();
        
        //Prompt the user for a number
        System.out.print("Please enter a second number: ");
        
        //store the number in a variable
        double secondNum = keyboard.nextDouble();
        
        //Prompt the user for a number
        System.out.print("Please enter a third number: ");
                
        //store the number in a variable        
        double thirdNum = keyboard.nextDouble();
        
        //calculate the average
        double avg = (firstNum + secondNum + thirdNum)  / 3; 
                
        //display the result
        System.out.printf("The average of %04.0f, %.1f and %.1f is %.4f %n",
                                firstNum, secondNum, thirdNum, avg);
    }
}
