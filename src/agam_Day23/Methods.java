package agam_Day23;


import java.util.Arrays;
import java.util.Scanner;


public class Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*oddNumber();
        evenNumber();
        System.out.println("your age ?");
        int n = scan.nextInt();
        isEligible(n);
        System.out.println("your country,age?");
        isVote(scan.nextInt(), scan.next());
        grade(88);
        areaOfCircle(4.5);
        areaOfSquare(5);
        is0(0);
        printEachChar("musty");
        printEachElement(new int[]{1, 2, 3, 4, 5});
        calculator(3,8,'*');
        fullName("cYdEo", "SCHOOL");
        anagram("silent", "listen");
        */



    }

    // 1-
    public static void oddNumber() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }

            i++;
        }
        System.out.println();
    }

    // 2-

    public static void evenNumber() {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            i++;
        }
        System.out.println();
    }

    // 3-

    public static void isEligible(int num) {
        if (num > 18)
            System.out.println("ok");
        else
            System.out.println("no");
    }

    // 4-
    public static void isVote(int age, String c) {
        if (age >= 20 && c.equalsIgnoreCase("usa"))
            System.out.println("eligible to vote!");
        else
            System.out.println("You are not eligible to vote!");
    }

    // 5-
    public static void grade(int n) {
        String str = (n > 90 && n <= 100) ? "excellent" : (n > 80 && n <= 90) ? "very well" : (n > 70 && n <= 80) ? "well" : (n > 60 && n <= 70) ? "good" : (n > 50 && n <= 60) ? "bad" : "fail";
        System.out.println(str);
    }

    // 6-
    public static void areaOfCircle(double num) {
        System.out.println("area: " + (Math.PI * num * num));
    }

    // 7-
    public static void areaOfSquare(double num) {
        System.out.println("area: " + (num * num));
    }

    // 12-
    public static void is0(int num) {
        if (num > 0)
            System.out.println("positive");
        else if (num < 0) {
            System.out.println("negative");
        } else
            System.out.println("zero");
    }

    // 13-
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println("\r" + str.charAt(i));
        }
    }

    // 14-
    public static void printEachElement(int[] arr) {
        for (int each : arr) {
            System.out.println(each);
        }
    }

    // 15-
    public static void calculator(int num1, int num2, char math) {
        if (math == '+')
            System.out.println(num1 + num2);
        else if (math == '-') {
            System.out.println(num1 - num2);
        } else if (math == '*') {
            System.out.println(num1 * num2);
        } else if (math == '/') {
            System.out.println(num1 / num2);
        }
    }

    // 16-
    public static void fullName(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = (str1.charAt(0) + "").toUpperCase() + str1.substring(1);
        str2 = (str2.charAt(0) + "").toUpperCase() + str2.substring(1);
        System.out.println(str1 + " " + str2);
    }

    // 17-
    public static void anagram(String str1, String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println(str1+" and "+str2+" are anagram.");
        }else
            System.out.println("not anagram");
    }




}
/*1. create a method that can print odd numbers between 1~100 in a same line saperated by space

	2. create a method that can print even numbers between 1~100 in a same line saperated by space

	3. create a method that can check if a person is eligible to buy alcohol

	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!


	5. create a method that can calculate the grade of the student based on the score

	6. create a method that can calculate the area of a circle

	7. create a method that can calculate the area of a square

	9. create a method that can convert dollar to euro

	10. create a method that can can convert dollar to lira

	11. create a method that can convert kg to lb

	12. create a method that can if the given integer is positive, negative or zero

	13. create a method named printEachChar that can print each characters of a string

	14. create a method named printEachElement that can print each elements of an integer array

	15. create a method named calculator that passes three arguments (num1, num2, mathOperator),
	prints the calculation result


	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"


    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram*/