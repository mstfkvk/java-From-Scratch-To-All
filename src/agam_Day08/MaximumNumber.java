package agam_Day08;

public class MaximumNumber {
    public static void main(String[] args) {
        int n1 = 300, n2 = 200;
        if( n1 > n2){
            System.out.println("max number: " + n1);
        }
        if( n1 == n2){
            System.out.println(" two numbers are equal");
        }
        if( n1 < n2){
            System.out.println("max number: " + n2);
        }
    }
}

/*3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number*/