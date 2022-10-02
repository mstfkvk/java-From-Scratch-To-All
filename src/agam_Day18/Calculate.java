package agam_Day18;

import java.util.Locale;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num2 = 0, num1;
        String str = "", repeat = "";
        do {
            System.out.println("num1");
            num1 = sc.nextInt();
            sc.nextLine();
            while (true) {
                System.out.println("operator");
                str = sc.nextLine();
                if ("*/+-".contains(str)) {
                    break;
                }
            }
            System.out.println("num2");
            num2 = sc.nextInt();
            sc.nextLine();
            int result = (str.equals("+")) ? num1 + num2 : (str.equals("-")) ? num1 - num2 : (str.equals("*")) ? num1 * num2 : num1 / num2;
            System.out.println("result= "+result);
            System.out.println("again?");
            repeat = sc.nextLine();

        } while ("yesno".contains(repeat.toLowerCase(Locale.ROOT)));

        sc.close();
    }
}
/*3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result


			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry */