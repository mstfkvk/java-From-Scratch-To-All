package agam_Day13;

import java.util.Scanner;

public class IsSame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = scan.nextLine();
        /*
        if ((""+text.charAt(0)).equals((""+text.charAt(text.length() - 1)))) {
            System.out.println("The string is same");
        }else {
            System.out.println("The string is not same");
        }
        */

        if (text.charAt(0) == text.charAt(text.length() - 1)) {
            System.out.println("The string is same");
        } else {
            System.out.println("The string is not same");
        }
    }
}
/*. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
                */