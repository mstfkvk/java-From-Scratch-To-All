package agam_Day24;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] n = removeElement(new int[]{10, 20, 30, 40, 50, 60}, 4);
        System.out.println(Arrays.toString(n));
    }

    public static int[] removeElement(int[] arr, int index) {
        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] temp = new int[arr.length - 1];
        for (int i = 0, j = 0; j < arr.length; i++, j++) {
            if (j == index) {
                i -= 1;
                continue;
            }
            temp[i] = arr[j];


        }

        return temp;
    }


}
/*10. create a method named removeElement that passes one integer array and one integer,
the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
*/