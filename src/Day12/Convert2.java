package Day12;

import java.util.*;

public class Convert2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an double: ");

        double convert = scan.nextDouble();
        System.out.println(convert + " miles equal to " + convert * 1.609 + " kilometers");


    }
}
/*4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers*/
