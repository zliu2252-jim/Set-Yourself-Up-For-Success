package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the RemoveDuplicate utility class.
 * Each test verifies that the removeDuplicates method behaves as expected for various scenarios.
 */
class RemoveDuplicateTest {
    /**
     * Test that removeDuplicates works with an empty list.
     */
    @Test
    void testEmptyList() {
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, RemoveDuplicate.removeDuplicates(input));
    }

    /**
     * Test that removeDuplicates works with a single-element list.
     */
    @Test
    void testSingleElementList() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("A"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("A"));
        assertEquals(expected, RemoveDuplicate.removeDuplicates(input));
    }

    /**
     * Test that removeDuplicates works with a list that has no duplicates.
     */
    @Test
    void testNoDuplicates() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(expected, RemoveDuplicate.removeDuplicates(input));
    }

    /**
     * Test that removeDuplicates removes all duplicate elements,
     * keeping the first occurrence of each unique element.
     */
    @Test
    void testWithDuplicates() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("A", "A", "B", "B", "C"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("A", "B", "C"));
        assertEquals(expected, RemoveDuplicate.removeDuplicates(input));
    }
}