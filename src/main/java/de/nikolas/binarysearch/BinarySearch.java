package de.nikolas.binarysearch;

import java.util.Optional;

/**
 * Implementation of a recursive Binary Search
 *
 * @author Nikolas Rummel
 * @version 1.0
 * @since 02.08.2021
 */

public class BinarySearch {

    /**
     * Searches for the index of the value x
     * in a given array.
     *
     * @param array
     * @param start
     * @param end
     * @param x
     * @return the index value of the searched element
     */
    public Optional<Integer> search(int array[], int start, int end, int x) {
        if(end >= 1) {

            int mid = start + (end - start) / 2;

            // If the searched element is in the middle
            if(array[mid] == x) {
                return Optional.of(mid);
            }


            // Element has to be in left half
            if(array[mid] > x) {
                return search(array, start, mid-1, x);
            }


            // Element has to be in right half
            return search(array, mid + 1, end, x);
        }

        return Optional.empty();
    }
}
