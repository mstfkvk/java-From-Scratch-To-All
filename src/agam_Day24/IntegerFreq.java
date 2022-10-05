package agam_Day24;

public class IntegerFreq {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        System.out.println(freqOfNumber(array,1));
    }

    public static int freqOfNumber(int[] array, int num) {
        int freq = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num)
                freq++;
        }
        return freq;
    }
}
/*5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5*/