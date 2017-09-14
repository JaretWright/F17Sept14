package f17sept14;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class F17Sept14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt the user for their name
        System.out.print("Please enter your name: ");
        
        //store the user name in a variable
        String myName = keyboard.nextLine();
        
        //print the user name to the screen
        System.out.printf("Hello %s%n", myName);
        System.out.print("Hello " + myName + "\n");
        System.out.println("Hello " + myName);
        
    }
    
}
