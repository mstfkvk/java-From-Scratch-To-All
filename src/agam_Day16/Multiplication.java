package agam_Day16;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("first number: ");
        int num1 = scan.nextInt();
        System.out.println("second number: ");
        int num2 = scan.nextInt();
        int a = 0;
        for (int i = 0; i < num2; i++) {
            a += num1;
        }
        System.out.println(a);
    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
*/