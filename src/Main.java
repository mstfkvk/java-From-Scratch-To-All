import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*Map<String, Integer> m1 = new LinkedHashMap<>();
        m1.entrySet();
        m1.get(null);
        System.out.println(m1);
        Map.Entry<String, String> entry1 = Map.entry("f", "g");
        entry1.getKey();
        //entry1.setValue("m");
        System.out.println(entry1);
        LinkedHashMap<String, Integer> m2 = new LinkedHashMap<>();
        m2.entrySet();

        int i = Integer.MAX_VALUE;
        System.out.println(0x80000000);
        System.out.println(0x7fffffff);*/

        String s1 = "mustykvkkvkkvk";
        System.out.println(s1.hashCode());

        String s2 = "musty";
        System.out.println(s2.hashCode());

        String s3 = new String(s1);
        System.out.println(s3.hashCode());

        String s4 = new String("musty");
        System.out.println(s4.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s4));
        System.out.println();
        int h = 0;
        h = (h * 31) + s1.charAt(0);
        h = (h * 31) + s1.charAt(1);
        h = (h * 31) + s1.charAt(2);
        h = (h * 31) + s1.charAt(3);
        h = (h * 31) + s1.charAt(4);
        h = (h * 31) + s1.charAt(5);
        h = (h * 31) + s1.charAt(6);
        h = (h * 31) + s1.charAt(7);
        h = (h * 31) + s1.charAt(8);
        h = (h * 31) + s1.charAt(9);
        h = (h * 31) + s1.charAt(10);
        h = (h * 31) + s1.charAt(11);
        h = (h * 31) + s1.charAt(12);
        h = (h * 31) + s1.charAt(13);
       // h = (h * 31) + s1.charAt(14);

        System.out.println(h);
        System.out.println("f".hashCode());
        System.out.println((int)("f".charAt(0)));

        /**
         * TODO: calculating the hashcode such like C#
         * public int hashCode(String str)
         * {
         *   int h = 0;
         *
         *   for (int i = 0; i < str.Length; i++)
         *     h = (h * 31) + str[i];
         *
         *   return h;
         * }
         * */


    }
}