package q2;

import java.util.Scanner;

/**
 * Sqrt, calculate the square root of number provided. 
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Sqrt {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        double a;
        double s;
        int n = 1;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        a = scan.nextDouble();
        s = (a + 1) / 2;
        System.out.println("The estimated sqrt of " + a + " is");
        System.out.println("Estimate " + n + ": " + s);
        s = (s + a / s) / 2;
        n = n + 1;
        System.out.println("Estimate " + n + ": " + s);
        s = (s + a / s) / 2;
        n = n + 1;
        System.out.println("Estimate " + n + ": " + s);
        s = (s + a / s) / 2;
        n = n + 1;
        System.out.println("Estimate " + n + ": " + s);
        s = (s + a / s) / 2;
        n = n + 1;
        System.out.println("Estimate " + n + ": " + s);
        s = (s + a / s) / 2;
        n = n + 1;
        System.out.println("Estimate " + n + ": " + s);
        s = (s + a / s) / 2;
        n = n + 1;
        System.out.println("Estimate " + n + ": " + s);
        s = (s + a / s) / 2;
        n = n + 1;
        System.out.println("Estimate " + n + ": " + s);
        s = (s + a / s) / 2;
        n = n + 1;
        System.out.println("Estimate " + n + ": " + s);
        s = (s + a / s) / 2;
        n = n + 1;
        System.out.println("Estimate " + n + ": " + s);
    }

}
