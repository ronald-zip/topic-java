package org.example;

public class JavaArraysMultidimensional {
    public static void main(String[] args) {

        // Defined a 2d-array
        int[][] array2d = {{1,2,3},{4,5},{12, 3, 5}};

        System.out.println("Value array2: pos 0 & order2 = "+array2d[0][2]);

        //Print size each sub-array
        System.out.println("The length is array2d[0] = " + array2d[0].length);
        System.out.println("The length is array2d[1] = " + array2d[1].length);
        System.out.println("The length is array2d[2] = " + array2d[2].length);

        // Defined a 3d-array

        int[][][] array3d =
                {
                        {
                                {1,2,3},
                                {4,5}
                        },
                        {
                                {11,12},
                                {23, 26, 20},
                                {34, 33, 31}
                        }
                };

        // Calling data on array 1, pos 2, order 2
        System.out.println(array3d[0][1][1]);
    }
}
