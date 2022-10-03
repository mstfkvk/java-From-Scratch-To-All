package agam_Day21;

public class Count {
    public static void main(String[] args) {
        int[] num={1,3,56,7,3,8,9,97,345,12,46,88};
        int evenCOunter=0,oddCounter=0;
        for(int i:num){
            if(i%2==0){
                evenCOunter++;
            }else
                oddCounter++;
        }
        System.out.println("even: "+evenCOunter+" rest of:" +oddCounter);
    }
}
/*
	2. Write a program that can count the even and odd number from an array of integers

			Note: MUST  use for each loop*/