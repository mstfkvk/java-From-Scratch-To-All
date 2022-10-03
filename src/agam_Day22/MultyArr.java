package agam_Day22;

import java.util.*;

public class MultyArr {
    public static void main(String[] args) {
/*
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        int[][] rev = new int[arr2D.length][];
        int c = 0;
        for (int i = 0, l = arr2D.length - 1; i < arr2D.length; i++, l--) {
            rev[i] = arr2D[i];

            for (int j = 0, k = arr2D[i].length - 1; j < arr2D[i].length; j++, k--) {
                c = rev[i][j];
                rev[i][j] = arr2D[l][k];
                arr2D[l][k] = c;
            }
            rev = arr2D;
            break;

        }
        System.out.println(Arrays.deepToString(rev));*/


        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9,10}};
        int[][] reversed = new int[arr2D.length][];


        for (int i = 0; i < arr2D.length; i++) {
            int[] temp = new int[arr2D[i].length];
            for (int j = 0; j < arr2D[i].length; j++) {
                 temp[(temp.length-1)-j] = arr2D[i][j];
            }
            reversed[(reversed.length-1)-i] = temp;
        }
        System.out.println(Arrays.deepToString(reversed));

    }
}
