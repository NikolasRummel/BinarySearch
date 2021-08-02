package de.nikolas.binarysearch;

import java.util.Optional;

/**
 * TODO: First element can't be found -> fix
 *
 * @author Nikolas Rummel
 * @version 1.0
 * @since 02.08.2021
 */

public class BinarySearchTest {

    public static void main(String[] args) {
        new BinarySearchTest().start();
    }


    private void start() {
        int[] array = { 2, 5, 8, 12, 17, 21, 28, 35 };


        int length = array.length-1;
        int x = 2;

        Optional<Integer> index = new BinarySearch().search(array, 0, length, x);

        if(index.isPresent()) {
            System.out.println("Element '" + x + "' found an´t index " + index.get());

        }else {
            System.out.println("Element '" + x + "' not present");
        }

    }

}
