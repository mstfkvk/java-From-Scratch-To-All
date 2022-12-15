package agam_Day41;


import java.util.*;
import java.util.concurrent.RunnableScheduledFuture;

public class Test {
    public static void main(String[] args) {
        try {
           // deathlyMethod();
        }catch (StackOverflowError error){
            error.getCause();
            System.out.println(error.getMessage());

        }

        System.out.println("Codes after Error executed or NOT?");

    }


    static int counter = 0;

    public static void deathlyMethod(){
        System.out.println(counter++);
        deathlyMethod();
    }
}