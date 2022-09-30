package agam_Day15;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter: ");
        String text = scan.nextLine(), t = "";
        int sum = 0, s = 0;

        // af7j351 ----> "7351"
        // af7j351 -----> "0070351"

        for (int i = 0; i < text.length(); i++) {
            if (!(text.charAt(i) >= '0' && text.charAt(i) <= '9')) {
                text = text.replace(text.charAt(i), '0');
                //t += (""+text.charAt(i));
                System.out.println(text);
            }
        }

       /* for (int j = 0; j < t.length(); j++) {
            s += Integer.valueOf("" + t.charAt(j));
        }*/

        for (int i = 0; i < text.length(); i++) {
            switch (("" + text.charAt(i))) {
                case "0":
                    sum += 0;
                    break;
                case "1":
                    sum += 1;
                    break;
                case "2":
                    sum += 2;
                    break;
                case "3":
                    sum += 3;
                    break;
                case "4":
                    sum += 4;
                    break;
                case "5":
                    sum += 5;
                    break;
                case "6":
                    sum += 6;
                    break;
                case "7":
                    sum += 7;
                    break;
                case "8":
                    sum += 8;
                    break;
                case "9":
                    sum += 9;
                    break;

            }
        }
        System.out.println("sum: " + sum);

    }
}
/* 6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...*/