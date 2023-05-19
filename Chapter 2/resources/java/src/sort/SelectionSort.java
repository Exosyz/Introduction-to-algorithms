package sort;

import java.util.Arrays;

public class SelectionSort {
    protected static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int small = i;

            for (int j = i; j < array.length; j++)
                if (array[j] < array[small])
                    small = j;

            int swap = array[small];
            array[small] = array[i];
            array[i] = swap;
        }

        return array;
    }
}
