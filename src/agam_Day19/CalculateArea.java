package agam_Day19;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans = "";
        System.out.println("Enter the radius of the circle:");
        double rad = scan.nextDouble();
        scan.nextLine();
        if (rad < 1) {
            System.err.println("Invalid Entry for the radius of the circle");
            System.exit(0);
        }
        System.out.println("Diameter of circle " + 2 * rad);
        System.out.println("Area of circle " + Math.PI * rad * rad);
        System.out.println("Perimeter of circle " + 2 * rad * Math.PI);
        while (true) {
            System.out.println("Would you like to calculate another circle?");
            ans = scan.nextLine();
            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Enter the radius of the circle:");
                rad = scan.nextDouble();
                scan.nextLine();
                if (rad < 1) {
                    System.err.println("Invalid Entry for the radius of the circle");
                    System.exit(0);
                }
                System.out.println("Diameter of circle " + 2 * rad);
                System.out.println("Area of circle " + Math.PI * rad * rad);
                System.out.println("Perimeter of circle " + 2 * rad * Math.PI);
                continue;
            }
            if (ans.equalsIgnoreCase("no")) {
                break;
            }
            if (!("yesno".contains(ans))) {
                System.out.println("re-enter!!!");
            }
        }

    }
}
/*1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers,
				terminate the program after displaying the error message
				"Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry*/