package agam_Day16;

import java.util.Scanner;

public class FiveNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bigger=Integer.MIN_VALUE;

        for (int i = 0; i <5 ; i++) {
            System.out.println("a number");
            int num = scan.nextInt();
            if(num>=bigger){
                bigger=num;
            }
        }
        System.out.println("bigger number= " + bigger);
    }
}
/*1. Write a program that asks user to enter number for 5 times,
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
*/