package agam_Day35.Candy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CandyFactory {

    public static void main(String[] args) {

        ArrayList<Candy> candyArrayList=new ArrayList<Candy>();

        Candy candy1=new Candy("ulker",3 ,120,true);
        Candy candy2=new Candy("eti",5 ,50,true);
        Candy candy3=new Candy("dandik",1 ,0,false);
        Candy candy4=new Candy("b",1 ,10,false);
        Candy candy5=new Candy("c",11 ,30,true);

        candyArrayList.add(candy1);
        candyArrayList.add(candy2);
        candyArrayList.add(candy3);

        System.out.println(candyArrayList.get(0).getQuantity());
        System.out.println(candyArrayList);
        System.out.println();
        System.out.println();
        System.out.println();
        candyArrayList.addAll(Arrays.asList(candy4,candy5));
        System.out.println(candyArrayList);
    }


}
/* 1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy*/