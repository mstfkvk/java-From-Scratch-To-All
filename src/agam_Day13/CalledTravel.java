package agam_Day13;

import java.util.Scanner;

public class CalledTravel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("valid passport: Y / N");
        // Boolean preferring = scan.nextBoolean();
        String preferring = scan.nextLine();

        int cost = 0;
        if (preferring.equals("y") || preferring.equals("Y")) {
            int baseCost = 1000;
            System.out.println("which country");
            String cntry = scan.nextLine();
            System.out.println("how many bags");
            byte bagValue = scan.nextByte();
            System.out.println("how many people");
            short peopleNumber = scan.nextShort();
            peopleNumber = (peopleNumber >= 3) ? 3 : peopleNumber;
            scan.nextLine();
            System.out.println("names by comma separate");
            String names = scan.nextLine();
            cost = baseCost + bagValue * 50 + peopleNumber * 100;
            System.out.println("Your ticket is booked to " + cntry + ". We have charged extra for the " + bagValue
                    + " bags but you are traveling with " + names + " so we are giving a discount. Your total cost is " + cost);
        } else {
            int renewal = 200;
            System.out.println("when expired year");
            int expiredYear = scan.nextInt();
            expiredYear = 2022 - expiredYear;
            scan.nextLine();
            System.out.println("which country");
            String cntry = scan.nextLine();
            System.out.println("next year Y / N ");
            String bool = scan.nextLine();
            if (bool.equals("y") || bool.equals("Y")) {
                cost += 100;
            } else {
                cost -= 50;
            }
            cost = cost + renewal + expiredYear * 75;
            System.out.println("Looks like your password has been expired for " + expiredYear + ", but not to worry we will get it ready " +
                    "for you to travel to " + cntry + ". Your total cost has come out to " + cost + ".");
        }


    }
}
/*3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
            		separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags
            		but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready
        			 for you to travel to $allCountries. Your total cost has come out to $costAmount."

*/