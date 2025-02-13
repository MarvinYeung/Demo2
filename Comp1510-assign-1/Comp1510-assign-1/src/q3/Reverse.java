package q3;

import java.util.Scanner;
import java.util.Stack;

/**
 * Reverse, reverse words order. 
 *
 * @author Marvin Yeung
 * @version 1.0
 */
public class Reverse {

    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> words = new Stack<>();
        System.out.println("Please enter 10 words. ");
        words.push(scan.next());
        words.push(scan.next());
        words.push(scan.next());
        words.push(scan.next());
        words.push(scan.next());
        words.push(scan.next());
        words.push(scan.next());
        words.push(scan.next());
        words.push(scan.next());
        words.push(scan.next());
        String result = 
                words.pop() + " " 
              + words.pop() + " " 
              + words.pop() + " " 
              + words.pop() + " " 
              + words.pop() + " " 
              + words.pop() + " " 
              + words.pop() + " " 
              + words.pop() + " " 
              + words.pop() + " " 
              + words.pop();
        System.out.println("In reverse order: " + result);
    }

}
