package agam_Day09;

public class AgeGroup {
    public static void main(String[] args) {
        byte age = (byte) 127;
        boolean infant = age >= 1 && age <= 2,
                toddler = age >= 3 && age <= 5,
                kid = age >= 6 && age <= 9,
                Pre_teen = age >= 10 && age <= 12,
                teenager = age >= 13 && age <= 17,
                young_adult = age >= 18 && age <= 20,
                adult = age >= 21 && age <= 39,
                young_middle_aged_adult = age >= 40 && age <= 49,
                middle_aged_adult = age >= 50 && age <= 54,
                very_young_senior_citizen = age >= 55 && age <= 64,
                young_senior_citizen = age >= 65 && age <= 74,
                senior_citizen = age >= 75 && age <= 84,
                old_citizen = age >= 85;
        if (infant) {
            System.out.println("infant");
        } else if (toddler) {
            System.out.println("toddler");
        } else if (kid) {
            System.out.println("kid");
        } else if (Pre_teen) {
            System.out.println("pre_teen");
        }else if (teenager) {
            System.out.println("teenager");
        }else if (young_adult) {
            System.out.println("young_adult");
        }else if (adult) {
            System.out.println("adult");
        }else if (young_middle_aged_adult) {
            System.out.println("young_middle_aged_adult");
        }else if (middle_aged_adult) {
            System.out.println("middle_aged_adult");
        }else if (very_young_senior_citizen) {
            System.out.println("very_young_senior_citizen");
        }else if (young_senior_citizen) {
            System.out.println("young_senior_citizen");
        }else if (senior_citizen) {
            System.out.println("senior_citizen");
        }else if (old_citizen) {
            System.out.println("old_citizen");
        }else {
            System.out.println("out of range");
        }
    }
}
/*5. Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
*/