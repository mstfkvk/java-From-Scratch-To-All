package agam_Day09;

public class SalaryAfterTax {
    public static void main(String[] args) {
        int salary = 200000;
        String isMarried = "married";

        if (isMarried == "married") {
            if (salary > 130000) {
                System.out.println("tax: " + (salary * 0.30));
            } else if (salary > 100000 && salary <= 130000) {
                System.out.println("tax: " + (salary * 0.25));
            } else if (salary > 80000 && salary <= 100000) {
                System.out.println("tax: " + (salary * 0.20));
            } else {
                System.out.println("tax: " + (salary * 0.15));
            }
        } else {
            if (salary > 130000) {
                System.out.println("tax: " + (salary * 0.35));
            } else if (salary > 100000 && salary <= 130000) {
                System.out.println("tax: " + (salary * 0.30));
            } else if (salary > 80000 && salary <= 100000) {
                System.out.println("tax: " + (salary * 0.25));
            } else {
                System.out.println("tax: " + (salary * 0.20));
            }
        }
    }
}
/*2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax

*/