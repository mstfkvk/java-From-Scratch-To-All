package agam_Day16;

import java.util.Scanner;

public class SameNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yazıyı gir:");
        String text = scan.nextLine(), text2, str1 = "cat", str2 = "dog";
        int counter1 = 0, counter2 = 0;
        text2 = text;


        for (int i = 0; i < text.length(); i++) {
            if (text.toLowerCase().contains(str1.toLowerCase())) {
                text = text.replaceFirst(str1, "");
                counter1++;
                System.out.println(counter1);
            }
        }

        for (int i = 0; i < text2.length(); i++) {
            if (text2.toLowerCase().contains(str2.toLowerCase())) {
                text2 = text2.replaceFirst(str2, "");
                counter2++;
            }
            System.out.println(counter2);
        }


        if (counter1 == counter2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
*/