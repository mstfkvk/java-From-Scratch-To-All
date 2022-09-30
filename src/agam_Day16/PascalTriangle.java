package agam_Day16;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number:");
        int num = scan.nextInt();
        int s = 1, before = 1, after = 0;
        for (int i = 1; i < num; i++) {
            if(s==1){
                System.out.println(s);
            }
            after = s;
            s += before;

            if (s == 2) {
                before = 1;
            } else {
                before = after;
            }

            System.out.println(s);
        }


    }
}
