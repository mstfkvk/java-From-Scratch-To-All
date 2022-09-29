package agam_Day10;

public class AgeGroups {
    public static void main(String[] args) {
        int age = -3;
        String group = "";
        if (age >= 0 && age < 150) {
            if (age < 21) {
                group = "Teenager";
            } else if (age >= 21 && age < 55) {
                group = "Adult";
            } else {
                group = "Senior";
            }
        } else {
            group = "invalid";
        }
        System.out.println(group);
    }
}
/*4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

*/