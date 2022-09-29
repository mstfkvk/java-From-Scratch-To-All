package agam_Day11;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 33;
        String f = "";
        if (floorNumber >= 1 && floorNumber <= 3) {
            switch (floorNumber) {
                case 1:
                    f = "floor " + floorNumber + " selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    f = "Floor " + floorNumber + " selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    f = "Floor " + floorNumber + " selected. Companies: Lyft, BofA, Stake house";
            }
        } else {
            f = "invalid floor " + floorNumber;
        }
        System.out.println(f);
    }
}
/*2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/