package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class is the main driver for showing duplicate removal in ArrayLists.
 * It prints the original list and a version with duplicates removed, using the RemoveDuplicate utility.
 * <p>
 * The main method showcases usage for both Integer and String lists.
 */
public class App {
    /**
     * The main entry point for the program.
     * It shows removing duplicates from integer and string lists.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // The example code about integers containing duplicates.
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 5, 5));
        printNoDuplicates(numbers);

        // The example code about strings containing duplicates.
        ArrayList<String> words = new ArrayList<>(Arrays.asList("A", "B", "B"));
        printNoDuplicates(words);

        // The example code about empty list.
        ArrayList<Double> emptyList = new ArrayList<>();
        printNoDuplicates(emptyList);

        // The example code about all unique characters.
        ArrayList<Character> uniqueChars = new ArrayList<>(Arrays.asList('X', 'Y', 'Z'));
        printNoDuplicates(uniqueChars);
    }

    /**
     * Prints the original list and the list after removing duplicates.
     * Uses RemoveDuplicate.removeDuplicates to show the removal value.
     *
     * @param list The ArrayList to process and print.
     * @param <T>  The type of elements in the ArrayList.
     */
    public static <T> void printNoDuplicates(ArrayList<T> list) {
        System.out.println("Original: " + list);
        System.out.println("No duplicates: " + RemoveDuplicate.removeDuplicates(list));
    }
}
