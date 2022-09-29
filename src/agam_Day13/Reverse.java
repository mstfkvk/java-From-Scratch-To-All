package agam_Day13;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter");
        String text = scan.nextLine();
        if (text.length() > 5) {
            System.out.println("Too long");
        } else if (text.length() < 5) {
            System.out.println("Too short");
        } else {
            text = ""+text.charAt(4) + text.charAt(3) + text.charAt(2) + text.charAt(1) + text.charAt(0);
            System.out.println(text);
        }
    }
}
/*1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
*/