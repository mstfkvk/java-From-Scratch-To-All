package Day12;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("limit of speed : ");
        int limit = scan.nextInt();

        System.out.println("current speed : ");
        int speed = scan.nextInt();
        String message = (speed > limit) ? "slow down" : "";
        System.out.println(message);

    }
}
/*2. Write a program for the speed check. a variable named speedLimit is given and assigned,
 ask user to enter the current speed, if the current speed is over the speedLimit print slow down,
  otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
*/