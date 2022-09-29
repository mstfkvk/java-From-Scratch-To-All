package agam_Day13;

import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string-1");
        String text1 = scan.nextLine();
        System.out.println("enter string-2");
        String text2 = scan.nextLine();
        if (text1.length() > text2.length()) {
            System.out.println(text1);
        } else {
            System.out.println(text2);
        }
    }
}
/*2. write a program that asks user to enter two strings, and print out the longest string
 */