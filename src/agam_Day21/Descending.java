package agam_Day21;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] num = {3, 5, -1, 24, 88, 19, 0, 44};
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[i]) {
                    n = num[j];
                    num[j] = num[i];
                    num[i] = n;
                }

            }
        }
        System.out.println(Arrays.toString(num));
    }
}
/*1. Write a program that sort the array of integer in descending order*/