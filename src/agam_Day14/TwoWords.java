package agam_Day14;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("word-1: ");
        String text1 = scan.nextLine();
        System.out.println("word-2: ");
        String text2 = scan.nextLine();
        System.out.println(text1.substring(1)+text2.substring(1));
    }
}
/*1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana*/