package agam_Day13;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence");
        String text = scan.nextLine();
        System.out.println("" + text.charAt(0) + text.charAt(text.length() - 1));
    }
}
/*1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence*/