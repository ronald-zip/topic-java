package org.example;

public class JavaArraysLoops {
    public static void main(String[] args) {

        // Create array
        float[] nums = {8, 102, 39, 1};

        System.out.println("Start loop");

        // Loop for, take index position to print data
        for (int i = 0; i < nums.length; i++ ) {
            System.out.println(nums[i]);
        }

        System.out.println("***\nArray with index\n***");

        // Loop for, take index position to print data with position on array
        for (int i = 0; i < nums.length; i++ ) {
            System.out.println("Position "+ i + ": number " + nums[i]);
        }
    }
}
