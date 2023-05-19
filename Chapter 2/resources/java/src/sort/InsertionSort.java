package sort;

import search.BinarySearch;

import java.util.Arrays;

public class InsertionSort {
    protected static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];

            int checkIndex = i - 1;
            while (checkIndex >= 0 && array[checkIndex] > currentValue) {
                array[checkIndex + 1] = array[checkIndex];
                checkIndex -= 1;
            }
            array[checkIndex + 1] = currentValue;
        }
        return array;
    }

    protected static int[] reverseInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];

            int checkIndex = i - 1;
            while (checkIndex >= 0 && array[checkIndex] < currentValue) {
                array[checkIndex + 1] = array[checkIndex];
                checkIndex -= 1;
            }
            array[checkIndex + 1] = currentValue;
        }
        return array;
    }

    protected static void recInsertionSort(int[] array) {
        recInsertionSort(array, array.length);
    }

    private static void recInsertionSort(int[] array, int n) {
        if (n <= 1)
            return;

        recInsertionSort(array, n - 1);

        int current = array[n - 1];
        int i = n - 2;

        while (i >= 0 && array[i] > current) {
            array[i + 1] = array[i];
            i--;
        }
        array[i + 1] = current;
    }

    protected static int[] insertionSortWithBinarySearch(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int pos = BinarySearch.recSearchPosition(array, 0, i-1, currentValue);

            for (int j = i; j > pos; j--) {
                array[j] = array[j - 1];
            }
            array[pos] = currentValue;
        }
        return array;
    }
}