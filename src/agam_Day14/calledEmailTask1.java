package agam_Day14;

import java.util.Scanner;

public class calledEmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("your email: ");
        String text = scan.nextLine();
        int index1 = text.indexOf("_");
        int index2 = text.indexOf("@");

        text=text.substring(index1+1, index2)+"_"+text.substring(0, index1)+text.substring(index2);
        System.out.println(text);


    }
}
/*7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com*/