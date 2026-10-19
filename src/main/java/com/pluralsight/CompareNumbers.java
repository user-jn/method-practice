
package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        // Create a Scanner to read user input
        Scanner scnr = new Scanner(System.in);

        System.out.println("*** Testing ***");

        // Ask user to enter a whole number
        System.out.print("Enter a number: ");
        int number = scnr.nextInt();

        // Call isEven method in main
        System.out.println("isEven(" + number + "): " + isEven(number));

        // Ask user to enter a decimal number
        System.out.print("\nEnter a number to check if it is positive: ");
        double decimalNumber = scnr.nextDouble();

        // Call isPositive method in main
        System.out.println("isPositive(" + decimalNumber + "): " + isPositive(decimalNumber));

        // Close the Scanner
        scnr.close();
    }

    // Check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Check if number is positive
    public static boolean isPositive(double number) {
        return number > 0;

    }
}
