package practice;

import java.util.Scanner;

public class NativeFactorial {
    public static void native_factorial() {
        int number;
        int factorial = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial: ");
        number = in.nextInt();

        for (int i = 1; i <= number; ++i)
            factorial *= i;

        System.out.printf("Factorial of the number %d is %d\n", number, factorial);


    }
}
