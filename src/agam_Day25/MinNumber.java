package agam_Day25;

public class MinNumber {
    public static void main(String[] args) {

    }

    public static int min(int[] array){
        int min = array[0];
        for (int each : array) {
            if(each < min){
                min = each;
            }
        }

        return min;
    }


    public static double min(double[] array){
        double min = array[0];
        for (double each : array) {
            if(each < min){
                min = each;
            }
        }

        return min;
    }

}
/*Task 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array

*/