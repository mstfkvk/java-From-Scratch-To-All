package agam_Day15;

import java.util.*;

public class test {
    public static void main(String[] args) {
        // DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        // WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String licence = scan.nextLine();
        if (licence.equalsIgnoreCase("no")) {
            System.out.println("Invalid data!");
            System.exit(0);

        }

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        scan.nextLine();
        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.nextLine();
        switch (vehicleOwnership) {
            case "Owned":
                premium += 10;
                break;
            case "Financed":
            case "Leased":
                premium += 20;
                break;
        }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.nextLine();
        switch (vehicleUsage) {
            case "Business":
                premium += 50;
                break;
            case "Pleasure":
                premium += 10;
                break;
            case "Commute":
                premium += 20;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += daysDrivenToWorkOrSchool * 5;
                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                premium = premium + milesToWorkOrSchool;
                break;
        }

        System.out.println("How old are you?");
        int age = scan.nextInt();

        if (age >= 16 && age < 18) {
            premium *= 20;
        } else if (age >= 18 && age <= 21) {
            premium *= 6;
        } else if (age > 21 && age < 25) {
            premium *= 2;
        } else if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else {
            premium *= 1;
        }

        System.out.println("How many years you've been driving?");
        int experience = scan.nextInt();
        if (age >= 16) {
            if ((age - experience) < 16) {
                System.out.println("Invalid data!");
                System.exit(0);
            } else {
                premium -= experience * 5;
            }
        }

        scan.nextLine();
        System.out.println("Have you had any accidents in the last 5 years?");
        String ans = scan.nextLine();
        if (ans.equalsIgnoreCase("Yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium = premium + premium * accidentsAmount * .2;
            scan.nextLine();
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.nextLine();
        if (continuousInsurance.equalsIgnoreCase("no")) {
            premium *= 2;
        }

        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();

        education = education.toLowerCase();

        switch (education) {
            case "phd":
            case "bachelors":
            case "masters":
                premium *= .95;
                break;
            case "doctors":
                premium *= .9;
                break;
            case "less than high school":
                premium *= 1.05;
                break;

        }

        System.out.println(name + ", here's your quote!");

        System.out.println("Start Your Policy Today For: $" + premium);

        referenceNumber = (name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode
                + education.trim().replace(" ", "")).toUpperCase();

        System.out.println("Reference number: " + referenceNumber);
        scan.close();


    }
}
/*
* Example:

Display message: Welcome to the CountyFarm car insurance!
Display message: Welcome to the CountyFarm car insurance!
Display message: Enter your name
Display message: Enter your name
input from user: David
input from user: David
Display message: Do you have a US driver license?
Display message: Do you have a US driver license?
input from user: Yes
input from user: Yes
Display message: Enter your zip code
Display message: Enter your zip code
input from user: 20910
input from user: 20910
Display message: Is this vehicle Owned, Financed, or Leased?
Display message: Is this vehicle Owned, Financed, or Leased?
input from user: Owned
input from user: Owned
Display message: How is this vehicle primarily used?
Display message: How is this vehicle primarily used?
input from user: Pleasure
input from user: Pleasure
Display message: How old are you?
Display message: How old are you?
input from user: 25
input from user: 25
Display message: How many years you've been driving?
Display message: How many years you've been driving?
input from user: 5
input from user: 5
Display message: Have you had any accidents in the last 5 years?
Display message: Have you had any accidents in the last 5 years?
input from user: No
input from user: No
Display message: Have you had continuous insurance for the past 12 months?
Display message: Have you had continuous insurance for the past 12 months?
input from user: Yes
input from user: Yes
Display message: What is the highest level of education you have completed?
Display message: What is the highest level of education you have completed?
input from user: PhD
input from user: PhD
Display message: David, here's your quote!
Display message: David, here's your quote!
Display message: Start Your Policy Today For: $52.25
Display message: Start Your Policy Today For: $52.25
Display message: Reference number: DA25ID20910PHD
Display message: Reference number: DA25ID20910PHD
*
* */