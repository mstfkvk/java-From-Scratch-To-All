package agam_Day14;

import java.util.Scanner;

public class Starts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("word: ");
        String text = scan.nextLine();
        if (text.startsWith("x")){
            text = text.substring(1);
        }
        System.out.println(text);
    }
}
/* 3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code*/