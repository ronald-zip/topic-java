package org.example;

public class JavaArraysCopy {
    public static void main(String[] args) {
        // Copy arrays
        // Way 1

        String[] names ={"Carl", "Max", "Abel"};
        String[] copynames = names;

        for(String o : names)
            System.out.println("Original array[] names "+ o);

        System.out.println("");

        for(String c : copynames)
            System.out.println("Copy array[] copynames "+ c);


        // Way 2

        int[] nums = {4, 23, 6, 2};
        int[] copynums = new int[10];

        for(int k : nums){
            int i=0;
            copynums[i] = k;
            System.out.println("Copynums array[] "+ copynums[i]);
            i++;
        }

        //for(int c : copynums)
        //    System.out.println("Copynums array[] "+ c);
    }
}
