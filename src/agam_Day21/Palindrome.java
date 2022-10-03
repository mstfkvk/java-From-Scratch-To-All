package agam_Day21;

public class Palindrome {
    public static void main(String[] args) {
        String[] str = {"anna", "level", "Java", "kavak", "yaka", "aya", "izi","a"};
        int counterF = 0, counterR = 0;
        for (String s : str) {
            for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
                if (s.charAt(i) == s.charAt(j))
                    counterF++;

            }
            if (counterF == s.length())
                counterR++;
            counterF = 0;

        }
        System.out.println(counterR);
    }
}
/*4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2*/