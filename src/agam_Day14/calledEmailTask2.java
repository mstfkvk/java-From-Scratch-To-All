package agam_Day14;

import java.util.Scanner;

public class calledEmailTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("your email: ");
        String text = scan.nextLine();
        int index1 = text.indexOf("_");
        int index2 = text.indexOf("@");
        int index3 = text.indexOf(".com");
        String firstName = text.substring(0, index1).toLowerCase();
        String lastName = text.substring(index1 + 1, index2).toLowerCase();
        String domain = text.substring(index2 + 1, index3).toLowerCase();
        System.out.println("First name: " + ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1) + "\n" +
                "Last name: " + ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1) + "\n" +
                "Domain: " + ("" + domain.charAt(0)).toUpperCase() + domain.substring(1));
    }
}
 /*8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple*/