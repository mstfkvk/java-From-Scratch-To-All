package agam_Day25;

import java.util.Arrays;

public class MaxNumber {
    public static int maxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int each : arr) {
            if (each > max)
                max = each;
        }
        return max;
    }

    public static double maxNumber(double[] arr) {
        double max = Integer.MIN_VALUE;
        for (double each : arr) {
            if (each > max)
                max = each;
        }
        return max;
    }
    public static short maxNumber(short[] arr) {
        short max = (short) Integer.MIN_VALUE;
        for (short each : arr) {
            if (each > max)
                max = each;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(new short[]{10,100,-10,1000}));
    }



}
/*Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

*/