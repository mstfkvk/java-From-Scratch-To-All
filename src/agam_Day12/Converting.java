package agam_Day12;

import java.util.Scanner;

public class Converting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter cents");
        int cents = scan.nextInt();

        System.out.println(cents + " cents equal to: " + cents / 100 + " dollars and " + cents % 100 + " cents");
    }
}
/*3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents*/