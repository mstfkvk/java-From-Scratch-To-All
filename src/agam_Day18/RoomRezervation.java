package agam_Day18;

import java.util.Scanner;

public class RoomRezervation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String finall = "";
        int kingBed = 120, queenBed = 100, singleBed = 80;
        System.out.println("which room?");
        String room = scan.nextLine();
        System.out.println("how many days?");
        int days = scan.nextInt();
        scan.nextLine();
        finall = finall + room + ": " + days * ((room.equals("kingBed")) ? kingBed : (room.equals("queenBed")) ? queenBed : singleBed);
        System.out.println(finall);
        do {
            System.out.println("another room?");
            System.out.println("which");
            room = scan.nextLine();


            if (room.equalsIgnoreCase("no")) {
                break;
            }
            if (!("yesno".contains(room.toLowerCase()))) {
                continue;
            }
            System.out.println("how many days?");
            days = scan.nextInt();
            scan.nextLine();
            finall = finall + room + ": " + days * ((room.equals("kingBed")) ? kingBed : (room.equals("queenBed")) ? queenBed : singleBed);
        } while (true);

        System.out.println(finall);

    }
}
/*2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights
            he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
*/