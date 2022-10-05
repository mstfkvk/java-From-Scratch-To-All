package agam_Day24;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kavak"));
    }

    public static boolean isPalindrome(String str) {
        return reverse.reverse(str).equals(str);
    }
}
/*4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true*/