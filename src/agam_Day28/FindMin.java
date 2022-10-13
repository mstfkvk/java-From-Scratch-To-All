package agam_Day28;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,-1));
        int min = list.get(0);
        for (Integer each : list) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("min = " + min);
    }
}
/*6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
*/