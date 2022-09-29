package agam_Day08;

public class isEligibleForCigarette {
    public static void main(String[] args) {
        byte age = 23;

        if (age >= 18) {
            System.out.println("your age is eligible for buying cigarettes");
        }
        if (age < 18){
            System.out.println("NO CİGARETTE");
        }
    }
}

/*1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes*/
