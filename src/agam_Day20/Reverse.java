package agam_Day20;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String[] classNames = {"musty kavak", "oguz cinar", "muhammed pisgin", "ali cengiz",
                "sukru aydın", "asya memdov", "omer tastan", "aleyna tilki", "kenan isik"};
        for (String str : classNames
        ) {

            char[] nameChar = new char[str.length()];
            for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
                nameChar[j] = str.toCharArray()[i];
            }
            String s = new String(nameChar);
            System.out.println(s);
        }
    }
}
/*2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
	*/