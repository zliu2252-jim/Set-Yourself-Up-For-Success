package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is about the tests for printNoDuplicates method in the App.
 * <p>
 * These tests verify the printed output of printNoDuplicates for different kinds of ArrayLists
 */
class AppTest {
    // The code below used to capture output during each test
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    /**
     * Redirect System.out to the ByteArrayOutputStream before each test.
     */
    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Restore System.out to the original setting after each test.
     */
    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    /**
     * Test printNoDuplicates with an empty list.
     */
    @Test
    void testPrintNoDuplicatesWithEmptyList() {
        ArrayList<String> list = new ArrayList<>();
        App.printNoDuplicates(list);
        String output = outContent.toString().trim();
        assertTrue(output.contains("Original: []"));
        assertTrue(output.contains("No duplicates: []"));
    }

    /**
     * Test printNoDuplicates with a single-element list.
     */
    @Test
    void testPrintNoDuplicatesWithSingleElement() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A"));
        App.printNoDuplicates(list);
        String output = outContent.toString().trim();
        assertTrue(output.contains("Original: [A]"));
        assertTrue(output.contains("No duplicates: [A]"));
    }

    /**
     * Test printNoDuplicates with a list of unique integers.
     */
    @Test
    void testPrintNoDuplicatesWithNoDuplicates() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        App.printNoDuplicates(nums);
        String output = outContent.toString().trim();
        assertTrue(output.contains("Original: [1, 2, 3]"));
        assertTrue(output.contains("No duplicates: [1, 2, 3]"));
    }

    /**
     * Test printNoDuplicates with a list containing duplicates.
     */
    @Test
    void testPrintNoDuplicatesWithDuplicates() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("A", "A", "B", "C", "C"));
        App.printNoDuplicates(words);
        String output = outContent.toString().trim();
        assertTrue(output.contains("Original: [A, A, B, C, C]"));
        assertTrue(output.contains("No duplicates: [A, B, C]"));
    }
}
