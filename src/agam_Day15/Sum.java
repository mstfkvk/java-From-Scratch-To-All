package agam_Day15;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number: ");
        int num = scan.nextInt();
        int sum=0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
/*3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275 */