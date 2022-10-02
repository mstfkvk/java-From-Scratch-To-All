package agam_Day20;

import java.util.Arrays;

public class EndZero {
    public static void main(String[] args) {
        int arr[] = {10, 0, 5, 0, 1, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    }

                }

            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
/*6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
                 */