package agam_Day10;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 19;
        String grade = "";
        if (number >= 1 && number <= 18) {
            if (number >= 1 && number <= 5) {
                grade = "Elemantary school";
            } else if (number >= 6 && number <= 8) {
                grade = "Middle school";
            } else if (number >= 9 && number <= 12) {
                grade = "High school";
            } else if (number >= 13 && number <= 16) {
                grade = "Collage";
            } else {
                grade = "Grad school";
            }
        } else {
            grade = "Invalid grade level given";
        }
        System.out.println(grade);
    }
}
/*1. Create a class called GradeLevel, Given a number(byte) grade
level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
*/