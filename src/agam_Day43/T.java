package agam_Day43;

import java.util.*;

public class T<E> {
    public static void main(String[] args) {

        Iterable<String> iterable = new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return null;
            }
        };


        Iterator<String> iterator1 = iterable.iterator();
        Set<String> set = new HashSet<>();

        set.addAll(Arrays.asList("q", "g", "j"));

        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        System.out.println(iterator);
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(iterator.next());


        List<String> s=new ArrayList<>();
        System.out.println(s);
    }
}
