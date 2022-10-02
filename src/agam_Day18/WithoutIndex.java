package agam_Day18;

public class WithoutIndex {
    public static void main(String[] args) {
        String str = "abaa", str1 = "";
        /*for (int i = 0; i <str.length() ; i++) {
            if(str.contains(""+str.charAt(i))){
                str=str.replace(""+str.charAt(i),"");
            }
        }
        System.out.println(str);*/
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= str.length(); j++) {
                if (!(str.startsWith(("" + str.charAt(i)).repeat(j)))) {
                    str1 += "" + str.charAt(i) + (j - 1);
                    str = str.substring(j - 1);
                    i = -1;
                    break;
                }

            }
        }
       str1 = str1 + str.charAt(0) + str.length();
        System.out.println(str1);

    }
}
/*5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character,
             then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
*/


/*
* a --> a1
* abcd --> a1b1c1d1
* aa --> a2
* aabcccd --> a2b1c3d1
* aabbaa --> a2b2a2
*
* */