package agam_Day25;

public class Merge {


    public static void main(String[] args) {

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


    public static double[] merge(double[] arr1, double[] arr2) {
        double[] temp = new double[arr1.length + arr2.length];
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
/*Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

*/