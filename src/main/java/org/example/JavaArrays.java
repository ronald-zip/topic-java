package org.example;

public class JavaArrays {
    public static void main(String[] args) {

        // Declare type array can be (float, double, int, String, char, byte)
        double[] nums;

        // Declare array with size
        String[] letters = new String[10];

        // Change size array
        nums = new double[20];

        // Asign data to array nums
        nums[0] = 13;
        nums[1] = 14;
        nums[2] = 3;
        nums[3] = 7;

        // Inicialize array

        int[] data = {1, 2, 3, 4, 5};

        System.out.println("Value 1: "+nums[0]);

        // Call to error
        System.out.println("Values: "+nums);

        // Index is a position on array always starts with 0
        System.out.println("Value 1 & index 0: "+data[0]);
    }
}
