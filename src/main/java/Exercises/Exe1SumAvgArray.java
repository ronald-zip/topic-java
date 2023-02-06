package Exercises;

public class Exe1SumAvgArray {
    public static void main(String[] args) {

        // Declare array called array1
        int[] array1 = {1, 3, 5, 21, 12, 45};

        // Declare acumulator to avg and sum
        float average;
        float sum = 0;

        for(int i=0; i<array1.length; i++) {
            sum = sum + array1[i];
        }

        average = sum/array1.length;

        System.out.println("The sum is equals to " + sum);
        System.out.println("The average is equals to " + average);

        // For-each simplified
        int[] array2 = {55, 23, 1, 4324, 3, 2};

        float avg2, sum2=0;

        for(int b : array2){
            sum2 = sum2 + b;
        }

        avg2 = sum2/array2.length;

        System.out.println("sum2 = "+ sum2);
        System.out.println("avg2 = " + avg2);
    }
}
