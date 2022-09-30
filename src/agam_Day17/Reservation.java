package agam_Day17;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cost = 0;
        String text = "";
        while (true) {
            System.out.println("reserve?");
            text = scan.nextLine();
            if (text.equalsIgnoreCase("yes")) {
                do {
                    System.out.println("which types?");
                    String type = scan.nextLine();
                    if (type.equalsIgnoreCase("king bed")) {
                        cost += 120;
                        System.out.println("maliyet= " + cost);
                        break;
                    } else if (type.equalsIgnoreCase("queen bed")) {
                        cost += 100;
                        System.out.println("maliyet= " + cost);
                        break;
                    } else if (type.equalsIgnoreCase("single bed")) {
                        cost += 80;
                        System.out.println("maliyet= " + cost);
                        break;
                    } else {
                        System.out.println("again");
                        continue;
                    }


                } while (true);
                break;
            }
            if (text.equalsIgnoreCase("no")) {
                System.out.println("have a nice day!");
                break;
            }
            System.out.println("apagin yes or no");
        }
    }
}
/*
    5. Create a class called RommReservation, write a program for the room reservation,
    your program asks the user wants to reserve a room.
    if user entered yes, then ask which type of room the user wants to reserve.
    if user entered no, print "have a nice day"
    (if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

    King Bed ==> 120$
    Queen Bed ==> 100$
    single Bed ==> 80$

the program should be able to display the room he/she reserved and total price of the room.

(if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)*/