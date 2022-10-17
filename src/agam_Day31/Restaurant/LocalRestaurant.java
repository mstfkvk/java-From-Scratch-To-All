package agam_Day31.Restaurant;

import java.util.ArrayList;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("mk", "izmir", "5");

        Server server1 = new Server("ali", 2335741, 24, true);
        Server server2 = new Server("veli", 10017905, 36, true);
        Server server3 = new Server("deli", 9898989, 17, false);

        Server[] servers = {server1, server2, server3};


        Chef chef1 = new Chef("janio", 10101010, 48, true);
        Chef chef2 = new Chef("danilo", 21212122, 8, false);

        Chef[] chefs = {chef1, chef2};

        restaurant.hireChef(chefs);
        restaurant.hireServer(servers);
        restaurant.terminateServer(10017905);

        System.out.println(restaurant);

    }
}
/*6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	    Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	                Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information*/