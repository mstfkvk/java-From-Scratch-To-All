package agam_Day17;

import java.util.Locale;
import java.util.Scanner;

public class ValidOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("num1:");
            int num1 = scan.nextInt();
            System.out.println("num2:");
            int num2 = scan.nextInt();
            scan.nextLine();
            System.out.println("operator:");
            String text = scan.nextLine();

            while (!("*/-+".contains(text))) {
                System.out.println("reenter operator:");
                text = scan.nextLine();
            }
            switch (text) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            System.out.println("result " + result);
            System.out.println("quit yes/no");
            String str = scan.nextLine();
            while (!(str.toLowerCase(Locale.ROOT).equals("yes") || str.toLowerCase(Locale.ROOT).equals("no"))) {
                System.out.println("repeat again yes/no");
                str = scan.nextLine();
            }
            if (str.equalsIgnoreCase("no"))
                break;

        }
    }

}


/* 3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator
		until user provides a valid operator (+, -, *, /)*/