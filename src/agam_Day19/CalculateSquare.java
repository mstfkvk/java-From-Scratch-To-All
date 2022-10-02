package agam_Day19;

import java.util.Locale;
import java.util.Scanner;

public class CalculateSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the side of the square:");
            int num = scan.nextInt();
            if (num <= 0) {
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            System.out.println("Area of square:" + num * num);
            System.out.println("Perimeter of square: " + 4 * num);
            String ans = "";
            do {
                System.out.println("Would you like to calculate another Square?");
                ans = scan.next();
                if ("yesno".contains(ans)) {
                    break;
                }

            } while (true);
            if (ans.toLowerCase(Locale.ROOT).equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }
    }
}
/*2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after
				 displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
*/