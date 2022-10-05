package agam_Day24;

import java.util.Arrays;

public class TwoInt {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,7},new int[]{4,5,6,8,9})));
    }


    public static int[] merge(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            temp[counter++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            temp[counter++] = arr2[i];
        }
        return temp;
    }
}
/*7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

*/