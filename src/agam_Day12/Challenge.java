package agam_Day12;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayi");
        int n1 = scan.nextInt();

        System.out.println("2.sayi");
        int n2 = scan.nextInt();

        System.out.println("3.sayi");
        int n3 = scan.nextInt();
        if (n1 == n2 && n2 == n3) {
            System.out.println(0);
        } else {
            if (n1 == n2 && n1 != n3) {
                System.out.println("cevap: " + n3);
            } else if (n1 == n3 && n1 != n2) {
                System.out.println("cevap: "+ n2);
            } else if (n2 == n3 && n2 != n1) {
                System.out.println("cevap: "+n2);
            }else {
                System.out.println("cevap: "+(n1+n2+n3));
            }
        }
    }
}
