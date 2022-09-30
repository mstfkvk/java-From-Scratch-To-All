package agam_Day15;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word: ");
        String str = scan.nextLine();


        int text = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt((str.length() - 1) - i)) {
                text += 1;
            }
        }
        if (text == str.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

/*
        StringBuffer str2= new StringBuffer("zengi");
        System.out.println(str2.reverse());
        */



    }
}
/*8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true*/