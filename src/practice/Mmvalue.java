/*
        MAXIMUM AND MINIMUM SEARCH

        REQUIREMENTS: ARRAY INITIALIZATION AND
        MAXIMUM AND MINIMUM SEARCH BY LOOP WHILE
 */

package practice;

import java.util.Scanner;

public class Mmvalue {
    public static void max_min_value() {
        int array_size = 0;
        int max, min = 0;
        int i = 0; // loop variable
        int[] numbers_array;
        Scanner number;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        array_size = Math.abs(in.nextInt()); // modulus of the number
        System.out.println();
        numbers_array = new int[array_size];


        do {
            System.out.printf("numbers_array[%d] = ", i);
            number = new Scanner(System.in);
            numbers_array[i] = number.nextInt();
            ++i;
        } while (i < array_size);
        System.out.println();

        max = max(numbers_array);
        min = min(numbers_array);

        System.out.printf("Max value in array is %d\n", max);
        System.out.printf("Min value in array is %d\n", min);

    }

    private static int max(int[] numbers_array) {
       int max = numbers_array[0];

        for (int num : numbers_array)
            if (num > max) max = num;

        return max;
    }

    private static int min(int[] numbers_array) {
        int min = numbers_array[0];

        for (int num : numbers_array)
            if (num < min) min = num;

        return min;
    }
}