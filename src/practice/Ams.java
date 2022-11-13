/*
        ARITHMETIC MEAN OF THE SERIES

        REQUIREMENTS: ARRAY INITIALIZATION BY LOOP FOR
 */

package practice;

import java.util.Scanner;

public class Ams {
    public static void find_arithmetic_mean() {
        int array_size = 0;
        int[] numbers_array;
        float arithmetic_mean = 0;
        Scanner number;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        array_size = Math.abs(in.nextInt()); // modulus of the number
        System.out.println();
        numbers_array = new int[array_size];


        for (int i = 0; i < array_size; ++i) {
            System.out.printf("numbers_array[%d] = ", i);
            number = new Scanner(System.in);
            numbers_array[i] = number.nextInt();
            arithmetic_mean += numbers_array[i];
        }
        System.out.println();


        arithmetic_mean /= array_size;
        System.out.printf("arithmetic mean of the array is %.1f \n", arithmetic_mean);

    }
}
