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

/**
 * Provides functionalities for managing calculation speeds, including entering predefined values,
 * sorting these values, and displaying them. 
 * please see usage of protected access modifier.
 * protected is producing accessibility only in those classes from the same package
 * on this context in this case default package.
 */
public class CalculatorSorter {
    
    /**
     * Returns a predefined array of doubles representing calculation speeds in milliseconds. 
     * This method simulates entering the speeds into the program, which in a real-world application,
     * could be replaced with user input or retrieval from a database.
     *
     * @return array of doubles containing the calculation speeds.
     */
    protected double[] enterArrayValues() {
        // This array is predefined with specific values for the purpose of this assessment.
        // In a practical scenario, these values could come from user input or another data source.
        return new double[]{21.23, 23.45, 23.71, 22.22, 24.12, 21.23, 21.23, 21.45};
    }

    /**
     * Sorts an array of calculation speeds in ascending order, from fastest to slowest. 
     * This method demonstrates
     * the use of the Arrays.sort utility method from the Java standard library.
     *
     * @param speeds The unsorted array of calculation speeds.
     * @return new array containing the sorted calculation speeds.
     */
    protected double[] sortArray(double[] speeds) {
        // clone() function the original array to avoid altering it directly,
        // allowing for other operations or comparisons with the unsorted data if needed.
        double[] sortedSpeeds = speeds.clone();
        // Use the Arrays.sort method to sort the cloned array,
        // resulting in a sorted sequence from the fastest (lowest value) 
        // to the slowest (highest value) calculation speeds.
        Arrays.sort(sortedSpeeds);
        return sortedSpeeds;
    }

    /**
     * Displays the sorted array of calculation speeds. Each speed is printed in a new line.
     * followed by "ms" to indicate milliseconds. 
     * easy to understand the order of calculation speeds from fastest to slowest.
     *
     * @param sortedSpeeds The array of sorted calculation speeds to be displayed.
     */
    protected void displayArray(double[] sortedSpeeds) {
        System.out.println("Calculation Speeds (Fastest to Slowest):");
        // Iterate through each speed in the sorted array, printing it to the console.
        // The printf method is formating the output to two decimal places.
        for (double speed : sortedSpeeds) {
            System.out.printf("%.2f ms\n", speed);
        }
    }
    
}
