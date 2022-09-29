package agam_Day11;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "grande";
        int calory1 = 90, calory2 = 120, calory3 = 150;
        double price1 = 3.69, price2 = 4.29;
         /*   if (size == "tall") {
            System.out.println(size + ":\n" + "price is $" + price1 + "\n" + calory1 +" calories");
        } else if (size == "grande") {
            System.out.println(size + ":\n" + "price is $" + price1 + "\n" + calory2 +" calories");

        } else if (size == "venti") {
            System.out.println(size + ":\n" + "price is $" + price2 + "\n" + calory3 +" calories");

        } else {
            System.out.println("İnvalid Size");
        }
    }

}*/


         /* switch (size) {
            case "tall":
                System.out.println(size + ":\n" + "price is $" + price1 + "\n" + calory1 + " calories");
                break;
            case "grande":
                System.out.println(size + ":\n" + "price is $" + price1 + "\n" + calory2 + " calories");
                break;
            case "venti":
                System.out.println(size + ":\n" + "price is $" + price2 + "\n" + calory3 + " calories");
                break;
            default:
                System.out.println("İnvalid Size");
                break;
        }*/

        if (size == "tall" || size == "grande" || size == "venti") {
            switch (size) {
                case "tall":
                    System.out.println(size + ":\n" + "price is $" + price1 + "\n" + calory1 + " calories");
                    break;
                case "grande":
                    System.out.println(size + ":\n" + "price is $" + price1 + "\n" + calory2 + " calories");
                    break;
                case "venti":
                    System.out.println(size + ":\n" + "price is $" + price2 + "\n" + calory3 + " calories");
                    break;

            }
        } else {
            System.out.println("invalid size");
        }
    }
}
/*Tasks:
	1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/