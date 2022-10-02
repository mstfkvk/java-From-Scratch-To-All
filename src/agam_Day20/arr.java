package agam_Day20;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        String classMates[]={"ali  haf","veli gfj ","deli kdj ","feli dfjhdfj", "keli fh f","leli dfsg ","reli gs "
                ,"peli mnn"};

        for (String str:classMates) {
            System.out.println(str.charAt(0)+"."+str.charAt(str.indexOf(" ")+1));
        }
    }
}
/*1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
*/