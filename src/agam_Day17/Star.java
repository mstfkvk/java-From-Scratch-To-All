package agam_Day17;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* for (int i = 1; i <7 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for (int i = 1; i < 7; i++) {
            for (int j = 1; j <7-i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <=7- i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 2 ; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }

            System.out.println();
        }*/


       /* for (int i = 0; i <= 7; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print("     ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("  "+(int)(Math.pow(2, j))+"  ");
            }
            for (int j = i; j-1 >= 0; j--) {
                System.out.print("  "+(int)(Math.pow(2, j-1))+"  ");
            }


            System.out.println();
        }*/


    /*    System.out.println("Enter 2 positive numbers: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter a Math operator: ");
        String operator = scan.nextLine();
        boolean validation = false;
        double result = 0.0;
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){
            validation = true;
        }
        System.out.println("validation = " + validation);
        *//*while (!validation){
            System.out.println("Enter a valid operator: ");
            operator = scan.nextLine();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){
                validation = true;
            }
        }*//*
        if (operator.equals("+")){
            result = n1 + n2;
        }
        else if (operator.equals("-")){
            result = n1 - n2;
        }
        else if (operator.equals("*")){
            result = n1 * n2;
        }
        else if (operator.equals("/")){
            result = n1 / n2;
        }
        System.out.println(result);*/


    }
}
