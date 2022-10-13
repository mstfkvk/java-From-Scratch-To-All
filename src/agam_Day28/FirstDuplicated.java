package agam_Day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstDuplicated {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,4,4,5,6,7,7));

        for (Integer s : list) {
            if(Collections.frequency(list,s) >1){
                System.out.println(s);
                break;
            }
        }


    }
}
/*7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2*/