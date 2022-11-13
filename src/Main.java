import practice.Ams;
import practice.HarmonicSeries;
import practice.Mmvalue;
import practice.NativeFactorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        System.out.print("Types of programs:\n" +
                         " 1. Finding arithmetic mean through a loop for\n" +
                         " 2. Searching for the maximum and minimum value using the loop while\n" +
                         " 3. First ten numbers of the harmonic series\n" +
                         " 4. Finding the factorial of a number\n\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of program: ");
        number = in.nextInt();
        System.out.println();


        switch (number) {
            case 1:
                Ams.find_arithmetic_mean();
                break;

            case 2:
                Mmvalue.max_min_value();
                break;

            case 3:
                HarmonicSeries.harmonic_series();
                break;

            case 4:
                NativeFactorial.native_factorial();
                break;
        }

        in.close();

    }

}
