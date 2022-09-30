package agam_Day15;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter: ");
        String s=scan.nextLine();
        int i = 0;
        String str = "";
        for (i = s.length() - 1; i >= 0; i--) {
            str +=s.charAt(i);
        }
        System.out.println("str = " + str);
    }
}
/*7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW*/