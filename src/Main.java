import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> m1 = new LinkedHashMap<>();
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
        System.out.println(0x7fffffff);


    }
}