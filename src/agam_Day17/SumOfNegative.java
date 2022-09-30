package agam_Day17;

import java.util.Scanner;

public class SumOfNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        while (true) {
            System.out.println("add number?");
            int num2 = scan.nextInt();

            if (num2 < 0) {
                System.out.println("no negative number");

                break;
            }
            num1 += num2;
        }
        System.out.println(num1);
    }
}
/*2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop*/