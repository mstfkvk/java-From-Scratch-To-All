package agam_Day24;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String str1 = "cba",str2 = "bac";
        System.out.println(isAnagram(str1,str2));;
    }
    public static boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean b = Arrays.equals(ch1,ch2);
        return b;
    }
}
/*
    2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true*/