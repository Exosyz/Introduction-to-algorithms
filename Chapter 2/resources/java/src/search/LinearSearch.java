package search;

import java.util.Arrays;

public class LinearSearch {
    protected static int find(int[] array, int search_value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search_value)
                return i;
        }
        return -1;
    }
}
