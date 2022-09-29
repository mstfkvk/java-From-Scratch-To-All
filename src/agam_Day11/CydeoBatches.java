package agam_Day11;

public class CydeoBatches {
    public static void main(String[] args) {
        String batchName = "US evening";
        String print = "";

       /* if (batchName == "US morning") {
            print = "Class times are 10-5 EST. M, T, Th, F.";
        } else if (batchName == "US evening") {
            print = "Class times are 7-10 EST. M, T, W, Th, S, S";
        } else if (batchName == " EU") {
            print = "Class times are  10-5 EST. M, T, W, Th, F.";
        } else {
            print = "Invalid Btach";
        }
        System.out.println(print);*/
        /*switch (batchName) {
            case "US morning":
                print = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                print = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                print = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                print = "invalid batch";
                break;
        }
        System.out.println(print);*/

        boolean bool = batchName == "US evening" || batchName == "US morning" || batchName == "EU";
        if (bool) {
            switch (batchName) {
                case "US morning":
                    print = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    print = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    print = "Class times are  10-5 EST. M, T, W, Th, F.";
            }
        } else {
            print = "invalid batch";
        }
        System.out.println(print);
    }
}
/*4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/