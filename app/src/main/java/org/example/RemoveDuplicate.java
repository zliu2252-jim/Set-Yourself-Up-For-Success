package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * The class is used for removing duplicate elements from an ArrayList.
 * <p>
 * The class provides a method to return a new ArrayList
 * containing only the first occurrence of each unique element, preserving the original order.
 */
public class RemoveDuplicate {
    /**
     * Removes duplicate elements from the given ArrayList, preserving the order of first appearance.
     *
     * @param list The input ArrayList containing duplicate elements.
     * @param <T>  The type of elements in the list.
     * @return A new ArrayList with duplicate elements removed.
     */
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        // LinkedHashSet preserves the order about the inserted elements
        Set<T> seen = new LinkedHashSet<>();
        ArrayList<T> result = new ArrayList<>();
        for (T item : list) {
            if (seen.add(item)) {
                result.add(item);
            }
        }
        return result;
    }
}