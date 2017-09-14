package f17sept14;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class WackyWeather {
    public static void main(String[] args)
    {
        System.out.print("What is the temperature outside? ");
        Scanner keyboard = new Scanner(System.in);
        int temperature = keyboard.nextInt();
        
        if (temperature <= 0)
            System.out.print("Brr...put on a coat!");
        
        if (temperature > 0 && temperature < 20)
            System.out.print("hmmm...put on a sweater");
        
        if (temperature >= 20)
            System.out.print("Sweet - go to the beach");
        
    }
}
