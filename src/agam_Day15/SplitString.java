package agam_Day15;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("tell me a word: ");
        String text = scan.nextLine();
        String letters = "", digits = "", specialChars = "";

        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= 'a' && text.charAt(i) <= 'z') || (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')) {
                letters += "" + text.charAt(i);
            } else if ((text.charAt(i) >= '0' && text.charAt(i) <= '9')) {
                digits += "" + text.charAt(i);
            } else {
                specialChars += "" + text.charAt(i);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
 /*5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!*/