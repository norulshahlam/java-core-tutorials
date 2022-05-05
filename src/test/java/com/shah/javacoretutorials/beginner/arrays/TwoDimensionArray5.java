package com.shah.javacoretutorials.beginner.arrays;


import org.junit.jupiter.api.Test;

class TwoDimensionArray5 {

    @Test
    void test() {
        //create 2 dimension array of 4 rows, 3 columns
        int[][] TwoDim = new int[4][3];

        int temp = 10;

        //assigning values
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                TwoDim[i][j] = temp;
                temp = temp + 10;
            }
        }

        //printing the values (in linear)
        System.out.println("\nlinear\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(TwoDim[i][j]);
            }
        }
        System.out.println("\nmatrix\n");
        //printing the values (in matrix)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(TwoDim[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/*
 		columns:3, rows:4
  		|10 |20 |30 |
  		|40 |50 |60 |
  		|70 |80 |90 |
  		|100|110|120|
 */
