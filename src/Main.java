/**
 * Module: Software Development: Programming Foundations
 * Student: Daniel Barbu: 20024094
 * Application: Outcome 4
 * Version: 1.0
 * Date: 25/03/2024
 * File: Main.java
 *
 * @author Daniel Barbu
 * @version 1.0
 */


/* Main class for the program. It demonstrates object-oriented programming by instantiating
 * CalculatorSorter class and using its methods to sort calculation speeds.
 */
public class Main {

    /**
     * The main method serves as the entry point for the Java application. It
     * handles CalculatorSorter class members, instantiation used and object
     * class CalculatorSorter accessing functionality from this class in order
     * to sort the array and its values and gives the result.
     *
     * @param args Command line arguments which are not used in this
     * application.
     */
    public static void main(String[] args) {
        CalculatorSorter sorter = new CalculatorSorter();

        // User enters the array values
        double[] userSpeeds = sorter.enterArrayValues();

        // Sort the array using insertion sort
        sorter.insertionSort(userSpeeds);

        // Display the sorted array
        sorter.displayArray(userSpeeds);
    }

}