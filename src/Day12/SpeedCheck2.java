package Day12;
import java.util.Scanner;
public class SpeedCheck2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("speed limit: ");
        int limit = scan.nextInt();
        System.out.println("current speed: ");
        int current = scan.nextInt();

        if (current>=limit){
            System.out.println("You're driving "+limit+" mph over the limit. Slow down!");
        }
    }
}
/*5. Write a program for the speed check. a variable named speedLimit is given and assigned,
 ask user to enter the current speed, if the current speed is over the speedLimit print slow down,
 otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!*/