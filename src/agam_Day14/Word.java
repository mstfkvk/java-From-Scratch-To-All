package agam_Day14;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("word: ");
        String text = scan.nextLine();
        if ((text.endsWith("ly"))){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }
    }
}
/* 2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"*/