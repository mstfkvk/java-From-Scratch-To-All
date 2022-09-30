package agam_Day17;

public class Div_Multy {
    public static void main(String[] args) {
        int num1 =55, num2=8, count=0;
        while (num1>=num2){
            num1 -=num2;
            count++;
        }
        System.out.println(count +" kere var"+" kalan: "+num1);
    }
}
/*1. Write a program that can divide two positive numbers without using /
 (division) and * (multiplication) operators*/