package q1;

import java.util.Scanner;


/**
 * Change, determine the fewest number of each bill 
 * and coin needed to represent the monetary amount. 
 *
 * @author Marvin Yeung
 * @version 1.0
 */
public class Change {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {

        double dollar;
        int a;
        double b;
        final int ten = 1000; 
        final int five = 500; 
        final int toonies = 200;
        final int loonies = 100;
        final int quarters = 25; 
        final int dimes = 10; 
        final int nickles = 5; 
        final int pennies = 1; 
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the monetary amount. ");
        dollar = scan.nextDouble();
        System.out.println("The fewest number of each bill "
                + "and coin needed to represent $" + dollar + " is");
        a = (int) (dollar * loonies);
        b = a % ten;
        a = (int) (a / ten);
        System.out.println(a + " ten  dollar bills");
        a = (int) (b / five);
        b = b % five;
        System.out.println(a + " five dollar bills");
        a = (int) (b / toonies);
        b = b % toonies;
        System.out.println(a + " toonies");
        a = (int) (b / loonies);
        b = b % loonies;
        System.out.println(a + " loonies");
        a = (int) (b / quarters);
        b = b % quarters;
        System.out.println(a + " quarters");
        a = (int) (b / dimes);
        b = b % dimes;
        System.out.println(a + " dimes");
        a = (int) (b / nickles);
        b = b % nickles;
        System.out.println(a + " nickles");
        a = (int) (b / pennies);
        System.out.println(a + " pennies");
    }

}
