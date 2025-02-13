package q4;

import java.util.Scanner;

/**
 * Encode and decode letters. 
 *
 * @author Marvin Yeung
 * @version 1.0
 */
public class Pack {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 letters from \"A\" to \"I\"");
        String input = scan.nextLine();
        final char n1 = input.charAt(0);
        final char n2 = input.charAt(1);
        final char n3 = input.charAt(2);
        final char n4 = input.charAt(3);
        final char n5 = input.charAt(4);
        int d1 = n1 - 'A' + 1;
        int d2 = n2 - 'A' + 1;
        int d3 = n3 - 'A' + 1;
        int d4 = n4 - 'A' + 1;
        int d5 = n5 - 'A' + 1;
        final int base = 56;
        int encoded = (((d1 * base + d2) * base + d3) * base + d4) * base + d5;
        System.out.println("Encoded: " + encoded);
        int d5decoded = encoded % base;  encoded /= base;
        int d4decoded = encoded % base;  encoded /= base;
        int d3decoded = encoded % base;  encoded /= base;
        int d2decoded = encoded % base;  encoded /= base;
        int d1decoded = encoded % base;
        char dc1 = (char) ((d1decoded - 1) + 'A');
        char dc2 = (char) ((d2decoded - 1) + 'A');
        char dc3 = (char) ((d3decoded - 1) + 'A');
        char dc4 = (char) ((d4decoded - 1) + 'A');
        char dc5 = (char) ((d5decoded - 1) + 'A');
        System.out.println("Decoded: " + dc1 + dc2 + dc3 + dc4 + dc5);
    }

}
