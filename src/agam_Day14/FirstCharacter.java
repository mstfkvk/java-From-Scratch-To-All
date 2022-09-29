package agam_Day14;

import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("word: ");
        String text = scan.nextLine();
        if (text.charAt(0) >= '0' && text.charAt(0) <= '9') {
            System.out.println("first character is digit");
        } else if (text.charAt(0) >= 'a' && text.charAt(0) <= 'z') {
            System.out.println("first character is lowercase letter");
        } else if (text.charAt(0) >= 'A' && text.charAt(0) <= 'z') {
            System.out.println("first character is uppercase letter");
        } else {
            System.out.println("first character is special character");
        }
    }
}
/* 5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table*/