package agam_Day20;

import java.util.Arrays;
import java.util.Random;

public class RevArr {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,9,-1};
        int[] rev = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i <= arr.length-1; i++, j--) {
            rev[j] = arr[i];
        }


        System.out.println(Arrays.toString(rev));
/*
        Random r=new Random();
        int num=r.nextInt(10);
        System.out.println(num);*/

        /* int[] num2=arr;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(num2));
        */



       /* int[] array = {1, 2, 3, 4, 5};


        int[] reverse_array = new int[array.length];

        for (int i = array.length - 1 ; i >= 0 ; ) {
            for (int j = 0; j < array.length; j++) {
                reverse_array[j] = array[i];
               i--;
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverse_array));*/

    }
}
/*5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
    */