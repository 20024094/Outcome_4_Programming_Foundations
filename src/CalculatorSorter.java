/**
 * Module: Software Development: Programming Foundations
 * Student: Daniel Barbu: 20024094
 * Application: Outcome 4
 * Version: 1.0
 * Date: 25/03/2024
 * File: CalculatorSorter.java
 *
 * @author Daniel Barbu
 * @version 1.0
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Provides functionalities for managing calculation speeds, including entering predefined values,
 * sorting these values, and displaying them. 
 * please see usage of protected access modifier.
 * protected is producing accessibility only in those classes from the same package
 * on this context in this case default package.
 */
import java.util.Scanner;

public class CalculatorSorter {

    /**
     * Prompts the user to enter an array of calculation speeds in milliseconds.
     * User input is then used to create and return an array of doubles.
     *
     * @return An array of doubles entered by the user.
     */
    protected double[] enterArrayValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many calculation speeds will you enter?");
        int numSpeeds = scanner.nextInt();

        double[] speeds = new double[numSpeeds];
        System.out.println("Enter each calculation speed in milliseconds:");

        for (int i = 0; i < numSpeeds; i++) {
            System.out.print("Speed " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();
        }

        scanner.close();
        return speeds;
    }

    /**
     * Sorts an array of calculation speeds in ascending order from fastest to slowest
     * using the insertion sort algorithm.
     *
     * @param speeds The array of calculation speeds to be sorted.
     */
    protected void insertionSort(double[] speeds) {
        for (int i = 1; i < speeds.length; i++) {
            double key = speeds[i];
            int j = i - 1;

            // Move elements of speeds[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && speeds[j] > key) {
                speeds[j + 1] = speeds[j];
                j = j - 1;
            }
            speeds[j + 1] = key;
        }
    }

    /**
     * Displays the sorted array of calculation speeds. Each speed is printed on a new line
     * followed by "ms" to indicate milliseconds, showing the order of calculation speeds
     * from fastest to slowest.
     *
     * @param speeds The array of sorted calculation speeds to be displayed.
     */
    protected void displayArray(double[] speeds) {
        System.out.println("Calculation Speeds (Fastest to Slowest):");
        for (double speed : speeds) {
            System.out.printf("%.2f ms\n", speed);
        }
    }
}

