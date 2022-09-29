package agam_Day13;

import java.util.*;

public class TipCalculator {
    public static void main(String[] args) {
        double tip;
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split y / n");
        String split = scan.next();
        System.out.println("people");
        int numberOfPeople = scan.nextInt();
        System.out.println("Enter the check amount:");
        int amount = scan.nextInt();
        scan.nextLine();
        System.out.println("How was the srvice quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.nextLine();
        if (quality.equals("Excellent")) {
            tip = amount * 0.25;
        } else if (quality.equals("Great")) {
            tip = amount * 0.2;
        } else if (quality.equals("Good")) {
            tip = amount * 0.15;
        } else if (quality.equals("Fair")) {
            tip = amount * 0.1;
        } else {
            tip = amount * 0.05;
        }
        if (split.equals("y") || split.equals("Y")) {
            System.out.println("Number of people entered:" + numberOfPeople + "\n" +
                    "Total to pay: " + (amount + tip) + "\n" + "Total tip: " + tip + "\n" + "Total per person: " +
                    (amount + tip) / numberOfPeople + "\n" + "Tip per person: " + tip / numberOfPeople);
        } else {
            System.out.println("Number of people entered:" + numberOfPeople + "\n" +
                    "Total to pay: " + (amount + tip) + "\n" + "Total tip: " + tip);
        }
    }
}
/*2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output)
	Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method


*/