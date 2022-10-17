package agam_Day31;

import java.util.Arrays;
import java.util.ArrayList;

public class AllClass {
    public static void main(String[] args) {

        Address address = new Address(1453, "mk street", "izmir", "turkey ege", 35000);
        System.out.println(address.buildingNumber + " " + address.street + "\n" + address.city + " " + address.state + ", " + address.zipCode);

        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 25", "10/25/2021", "Kuzzat Altay");
        movie1.addCast("asya");
        String[] casts={"muhtar", "adam","mk","zengi","pisgin","sukru"};
        movie1.addCasts(casts);
        System.out.println("movie = " + movie1);

        Item item= new Item("mmk",10,5);
        System.out.println(item);

        Carpet carpet=new Carpet(10,20,5,false);
        System.out.println(carpet);


    }
}
