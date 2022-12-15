import java.io.ObjectInputStream;
import java.lang.*;

public class AllReview {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer((char) 'f');
        stringBuffer.append('v');
        //System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder();
        boolean e = stringBuilder.equals(stringBuffer);
        // 'equals' between objects of """inconvertible""" types 'StringBuilder' and 'StringBuffer'
        //System.out.println(e);
        /*
         *

        int i = 0;
        while (i < 10) {

            if (i++ > 5) {
                break;
            } else {
                if (i-- < 4) {
                } else {
                    System.out.println(i);
                    continue;
                }
            }
        }
        /*
         *
         */
        char[] s={'m','k','a','v','a','k','a'};
        String s1 = new String(s, 1, 5);
        System.out.println(s1);
        System.out.println(s1.equals("kavak"));
        System.out.println(s1.codePointAt(3)); // same
        System.out.println((int)s1.charAt(3));       // same
        /*
         *
         */

    }
}