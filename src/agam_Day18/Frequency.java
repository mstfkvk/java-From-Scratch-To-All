package agam_Day18;

public class Frequency {
    public static void main(String[] args) {
        String str = "aabc", str1 = "";
        int count = 1;
        int j = 0, i = 0;
        for (i = 0; i < str.length();i++ ) {
            if (str.length() == 1) {
                str1 = str + count;
                break;
            } else {
                for (j = i + 1; j < str.length(); ) {
                    if ((str.charAt(j) == str.charAt(i))) {
                        if (!(str1.contains("" + str.charAt(i)))) {
                            str1 = str1 + str.charAt(i);
                        }
                        count++;
                        j++;
                        break;
                    } else {
                        if (str.substring(j).length() >= 1) {
                            if (!(str1.contains("" + str.charAt(i)))) {
                                str1 = str1 + str.charAt(i);
                            }
                            str1 += count;
                            str1 = str1 + str.charAt(j);

                        } else {
                            str1 += count;

                        }
                        count = 1;
                        i = j - 1;

                        break;
                    }
                }

            }
        }
        if (i == str.length()) {
            System.out.println(str1 + count);
        } else {
            System.out.println(str1);
        }
    }
}
/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
*/