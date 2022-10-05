package agam_Day24;

import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        int a[] = revInt(new int[]{10, 20, 30, 40});
        System.out.println(Arrays.toString(a));
    }

    public static int[] revInt(int[] arr) {
        int[] temp = new int[arr.length];
        int num = arr.length - 1;
        for (int i : arr) {
            temp[num--] = i;
        }
        return temp;
    }


}
/*8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}*/