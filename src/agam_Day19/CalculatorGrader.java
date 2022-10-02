package agam_Day19;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorGrader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       while (true){
           System.out.println("Enter your score");
           int score = scan.nextInt();
           scan.nextLine();
           String grade = "";

           if (score < 0 || score > 100) {
               System.out.println("Invalid Entry");
               System.exit(0);
           }
           if (score > 90 || score <= 100) {
               grade = "A";
           } else if (score > 80 || score <= 89) {
               grade = "B";
           } else if (score > 70 || score <= 79) {
               grade = "C";
           } else if (score > 60 || score <= 69) {
               grade = "D";
           } else {
               grade = "E";
           }
           System.out.println("your grade = "+grade);
           System.out.println("would you like to continue");
           String ans = scan.nextLine();
           if (!("yesno".contains(ans.toLowerCase(Locale.ROOT)))) {
               System.out.println("Invalid Entry");
               System.exit(0);
           }

           if (ans.equalsIgnoreCase("yes")) {
               continue;
           } else {
               System.out.println("Thank you for using Cydeo Grade Calculator APP");
               break;
           }
       }

    }
}
/*4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying
				the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying
				the error message "Invalid Entry"*/