package agam_Day27;

import java.util.Arrays;

public class TotalNumber {
    public static boolean isEqual(String str) {
        int numOfLowerCase = 0, numOfUpperCase = 0;
        boolean b = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                numOfUpperCase++;
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                numOfLowerCase++;
            }
        }

        b = (numOfUpperCase == numOfLowerCase) ? true : false;


        return b;
    }

    public static void main(String[] args) {
        String str = "JAVA javaa";
        System.out.println(isEqual(str));





    }


}
/*4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
*/