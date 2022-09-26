package Day10;

public class Grade {
    public static void main(String[] args) {
        char a = 'A';
        String name = "";
        if (a >= 'A' && a <= 'F') {
            if (a == 'A') {
                name = "excellent";
            } else if (a == 'B') {
                name = "great job";
            } else if (a == 'C') {
                name = "good";
            } else if (a == 'D') {
                name = "passed";
            } else {
                name = "failed";
            }
        } else {
            name = "invalid";
        }
        System.out.println(name);
    }
}
/*3. Create a class called Grade,
a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: "invalid"

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

*/