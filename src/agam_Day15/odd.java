package agam_Day15;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        String str = scan.next();*/
        int sum = 0;
        for (int i = 1; i < 100; i+=2) {
            sum += i;
        }
        System.out.println(sum);

    }
}
/*1. Write a program that can return the sum of even numbers between 1 to 100*/