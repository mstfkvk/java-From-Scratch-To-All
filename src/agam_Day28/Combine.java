package agam_Day28;

import java.util.*;

public class Combine {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("D", "E", "F", "G"));

        ArrayList<String> newArr = new ArrayList<>(7);
        for (String s : arr1) {
            newArr.add(s);
        }
        for (String s : arr2) {
            newArr.add(s);
        }

        System.out.println(newArr);
    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
*/