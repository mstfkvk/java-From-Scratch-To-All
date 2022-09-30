package agam_Day15;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("fact. number: ");
        int num = scan.nextInt(), fact = 1;

        for (int i = 1; i <= num; i++) {
        fact *=i;
        }
        System.out.println(fact);
    }
}
/*4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )*/