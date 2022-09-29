package agam_Day14;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("account number: ");
        String text = scan.nextLine();
        if ((text.startsWith("2") && text.length() == 7) || (text.startsWith("5") && text.length() == 10)) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid account number");
        }

    }
}
/*
    6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”*/