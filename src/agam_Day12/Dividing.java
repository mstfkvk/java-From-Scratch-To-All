package agam_Day12;

import java.util.Scanner;

public class Dividing {
    public static void main(String[] args) {
        int quarter, // çeyreklik
                dimes, // 10 luk
                nickel, // 5 lik
                penny; // 1 kurus
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz pls");
        int userMoney = scan.nextInt();

        if (userMoney >= 0 && userMoney <= 100) {
            quarter = (userMoney - userMoney % 25) / 25;
            dimes = ((userMoney % 25) - (userMoney % 25) % 10) / 10;
            nickel = ((userMoney % 25) % 10 - ((userMoney % 25) % 10) % 5) / 5;
            penny = userMoney-25*quarter-10*dimes-5*nickel;
            System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes, " + nickel + " nickels, and " + penny + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }
    }
}
