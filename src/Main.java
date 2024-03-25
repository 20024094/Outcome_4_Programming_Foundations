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
        /* Instantiate the CalculatorSorter class. 
        This object (sorter) will be used to call the methods responsible for entering,
        sorting, and displaying calculation speeds.*/
        CalculatorSorter sorter = new CalculatorSorter();

        /* Call the method to enter the array values. 
           This method is designed to simulate user input or retrieval
           of calculation speeds from a predefined dataset.*/
        double[] speeds = sorter.enterArrayValues();

        /* Sort the array of calculation speeds from fastest to slowest using the sortArray method. 
           This method takes  the unsorted array as input and returns 
           a new array that is sorted in ascending order.*/
        double[] sortedSpeeds = sorter.sortArray(speeds);

        /* Display the sorted array of calculation speeds. 
           This method iterates over the sorted array and prints each
           value in a human-readable format, demonstrating the speeds from fastest to slowest.*/
        sorter.displayArray(sortedSpeeds);
    }

}