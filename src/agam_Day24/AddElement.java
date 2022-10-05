package agam_Day24;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addElement(new int[]{1,2,3},4)));
    }

    public static int[] addElement(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];
        int i;
        for (i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[i]=num;
        return newArr;
    }
}
/* 6. create a method named addElement that takes one integer array and one integer,
the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
* */
