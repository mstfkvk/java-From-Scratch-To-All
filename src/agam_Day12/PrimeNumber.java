package agam_Day12;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 2, count = 0, prime = 0;
        int i;
        while (count != 1) {

            for (i = 2; i < 5; i++) {

                if (number % i == 0) {
                    number++;

                } else {
                    prime = number;
                    number++;
                    count++;


                }
            }


        }
        System.out.println(count);
        System.out.println(prime);
    }
}
