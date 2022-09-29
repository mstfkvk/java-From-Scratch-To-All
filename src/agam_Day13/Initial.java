package agam_Day13;

import java.util.*;

public class Initial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("user name and surname");
        String name = scan.nextLine();

        System.out.println(name.substring(0, 1).toUpperCase() + "." + name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase());
    }
}
/*4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
*/