package ca.bcit.comp1510.ch10;

/**
 * Demonstrates the selection sort and insertion sort algorithms.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Sorting {
    /**
     * Sorts the specified array of objects using the selection sort algorithm.
     * 
     * @param <T> Type placeholder for comparable type
     * @param list Array to be sorted
     */
    public static <T extends Comparable<T>> void selectionSort(T[] list) {
        int min;
        T temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo((T) list[min]) < 0) {
                    min = scan;
                }
            }

            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    /**
     * Sorts the specified array of objects using the insertion sort algorithm.
     * 
     * @param <T> Type placeholder for comparable type
     * @param list Array to be sorted
     */
    public static <T extends Comparable<T>> void insertionSort(T[] list) {
        for (int index = 1; index < list.length; index++) {
            T key = list[index];
            int position = index;

            // Shift larger values to the right
            while (position > 0 && key.compareTo((T) list[position - 1]) < 0) {
                list[position] = list[position - 1];
                position--;
            }

            list[position] = key;
        }
    }
}

