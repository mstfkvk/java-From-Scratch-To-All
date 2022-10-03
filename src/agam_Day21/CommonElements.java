package agam_Day21;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        for (int a : arr1){
            for(int b:arr2){
                if(a==b)
                    System.out.print(a+" ");
            }
        }

    }
}
/*
	3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops*/