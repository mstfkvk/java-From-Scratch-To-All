package agam_Day21;

import java.util.Arrays;

public class MergeThreeElements {
    public static void main(String[] args) {
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] sum = new int[arr1.length + arr2.length + arr3.length];
        for (int i = 0; i < sum.length; i++) {
            if (i < arr1.length) {
                sum[i] = arr1[i];
            } else if (i >= arr1.length && i < arr2.length + arr1.length) {
                sum[i] = arr2[i - arr1.length];
            } else if (i >= arr1.length + arr2.length && i < arr3.length + arr2.length + arr1.length) {
                sum[i] = arr3[i - arr1.length - arr2.length];
            }
        }
        System.out.println(Arrays.toString(sum));
    }
}
/*5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}*/