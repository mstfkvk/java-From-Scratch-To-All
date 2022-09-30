package agam_Day16;

import java.util.Locale;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        System.out.println("number:");
        int num = scan.nextInt();
        int prime = 0;
        for (int i = 2; i < num; i++) {
            for (int k = 2; k < i ; k++) {
                if (i % k == 0) {
                    break;
                } else {

                    count++;
                }

            }
            if(count == i-2){
                prime=i;
            }
        }
        System.out.println(prime);

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = scan.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        System.out.println("Enter searching word : ");
        String s = scan.nextLine();
        s = s.toLowerCase();

        int counter2 = 0;
        for (int i = 0; i < str.length(); i++) {
            int counter1 = 1;
            if (str.charAt(i) == s.charAt(0)){
                for (int j = 1; j < s.length(); j++) {
                    if (s.charAt(j) == str.charAt(i+j)){
                        counter1++;
                        if (counter1 == s.length()){
                            counter2++;
                        }
                    }
                }
            }
        }
        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'J'){
                if (str.charAt(i+1) == 'a'){
                    if(str.charAt(i+2) == 'v'){
                        if (str.charAt(i+3) == 'a')
                            counter++;
                    }
                }
            }
        }
        System.out.println("counter = " + counter2);
*/
        /*Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        String answer="";
        do {
            System.out.println("Enter item" + count + " and its price:");
            String item1 = scan.nextLine();
            int price1 = scan.nextInt();
            scan.nextLine();
            shoppingListReport = shoppingListReport + item1 + price1;
            totalPrice += price1;
            System.out.println("Add one more item?");
            answer = scan.nextLine();


        } while (answer.equalsIgnoreCase("Yes"));
        System.out.println(shoppingListReport);
*/

       /* String ac = "kajavamajavadajavaya";
        int a = 0;
        int sayac = 0;
        for (int i = 0; i < ac.length(); i++) {
            if (ac.indexOf("java",a)>0){
                sayac++;
                a=ac.indexOf("java");
            }
        }
        System.out.println(sayac);*/


    }

}