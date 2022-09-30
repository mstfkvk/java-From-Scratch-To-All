package agam_Day16;

import java.util.Locale;
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yazıyı gir:");
        String text = scan.nextLine(), str = "java";
        int counter = 0;


          /*  for (int i = 0; i < text.length(); i++) {
                if (text.toLowerCase().contains(str.toLowerCase())) {
                    text=text.replaceFirst(str,"");
                    counter++;
                }

            }*/




/*
            for (int i = 0; i <= text.length()-str.length(); i++) {
                if (text.substring(i, str.length() + i).equalsIgnoreCase(str)) {
                    counter++;
                }
            }*/


        System.out.println(counter);

    }
}
/*4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

*/