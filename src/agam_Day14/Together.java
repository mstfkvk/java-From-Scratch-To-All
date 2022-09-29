package agam_Day14;

import java.util.Scanner;

public class Together {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("word-1: ");
        String text1 = scan.nextLine();
        System.out.println("word-2: ");
        String text2 = scan.nextLine();
        String text = null;
        if (("" + text1.charAt(text1.length() - 1)).equals("" + text2.charAt(0))) {
            text = text1 + text2.substring(1);
        } else {
            text = text1 + text2;
        }
        System.out.println(text);
    }
}
/* 4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
*/