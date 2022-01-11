package com.NunesDev.Arrays;

import java.util.Random;

public class MultiDim {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for( int i = 0; i < M.length; i++){
            for(int c = 0; c < M[i].length; c ++){
                M[i][c] = random.nextInt(9);
            }
        }
        System.out.print("Matriz: ");
        for (int[] l: M
             ) {
            for (int col: l
                 ) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
