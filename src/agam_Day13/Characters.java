package agam_Day13;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String text = scan.nextLine();

        if (text.length() == 0) {
            System.out.println("empty string");
        } else if (text.length() > 3) {
            System.out.println(text.substring(text.length() - 3));
        } else {
            System.out.println(text);
        }
    }
}
/*5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself*/