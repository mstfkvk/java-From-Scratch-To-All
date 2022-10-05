package agam_Day23;

import java.util.Arrays;

public class MethSukru {
    public static void main(String[] args) {
        oddNumbersToHundred();
        evenNumbersToHundred();
        isEligibleToBuyAlcohol(25);
        isEligibleToVote(28, "USA");
        grade(85);
        areaOfCircle(2);
        areaOfSquare(5);
        dollarToEuro(100);
        dollarToLira(100);
        kgToLb(10);
        posNegZero(9);
        printEachChar("kassya");
        int[] arr1D = {1, 2, 3};
        printEachElement(arr1D);
        calculator(2, 3, '+');
        fullName("şÜkRÜ", "aydIN");
        anagram2String("silent", "listen");


    }

    public static void oddNumbersToHundred() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void evenNumbersToHundred() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void isEligibleToBuyAlcohol(int age) {
        if (age >= 18) {
            System.out.println("person is eligible to buy alcohol");
        } else {
            System.out.println("person is NOT eligible to buy alcohol");
        }
    }

    public static void isEligibleToVote(int age, String citizenship) {
        if (age >= 21 && citizenship.equalsIgnoreCase("usa")) {
            System.out.println("person is eligible to vote for USA");
        } else {
            System.out.println("person is NOT eligible to vote for USA");
        }
    }

    public static void grade(int score) {
        char result = (score >= 90 && score <= 100) ? 'A' : (score >= 80 && score <= 89) ? 'B' : (score >= 70 && score <= 79) ? 'C'
                : (score >= 60 && score <= 69) ? 'D' : 'F';
        System.out.println(result);
    }

    public static void areaOfCircle(double radius) {

        System.out.println("area of the circle : " + (3.14 * radius * radius));

    }

    public static void areaOfSquare(double side) {

        System.out.println("area of the square is :" + (side * side));

    }

    public static void dollarToEuro(double dollar) {

        System.out.println(dollar + " is equal to " + (dollar * 0.96) + " euros");

    }

    public static void dollarToLira(double dollar) {

        System.out.println(dollar + " is equal to " + (dollar * 17.15) + " TL");

    }

    public static void kgToLb(double kg) {

        System.out.println(kg + " is equal to " + (kg * 2.2) + " lbs");

    }

    public static void posNegZero(int number) {

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else if (number == 0) {
            System.out.println(number + " is zero");
        }

    }

    public static void printEachChar(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) + ", ";
        }
        result = result.substring(0, result.length() - 2);
        System.out.println(result);
    }

    public static void printEachElement(int[] arr) {

        for (int each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();

    }

    public static void calculator(double num1, double num2, char mathOperator) {

        double result = (mathOperator == '+') ? (num1 + num2) : (mathOperator == '-') ? (num1 - num2)
                : (mathOperator == '*') ? (num1 * num2) : (mathOperator == '/') ? (num1 / num2) : -1;
        System.out.println(result);

    }

    public static void fullName(String firstName, String lastName) {

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);

    }

    public static void anagram2String(String str1, String str2) {

        char[] s1 = str1.toCharArray();
        Arrays.sort(s1);
        char[] s2 = str2.toCharArray();
        Arrays.sort(s2);
        boolean isAnagram = Arrays.equals(s1, s2);
        System.out.println(str1 + " and " + str2 + " are anagram: " + isAnagram);
    }
}
