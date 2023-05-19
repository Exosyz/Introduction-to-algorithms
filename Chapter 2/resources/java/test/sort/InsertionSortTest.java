package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void insertionSort() {
        Assertions.assertArrayEquals(new int[]{26, 31, 41, 41, 58, 59}, InsertionSort.insertionSort(new int[]{31, 41, 59, 26, 41, 58}));
    }

    @Test
    void reverseInsertionSort() {
        Assertions.assertArrayEquals(new int[]{59, 58,41,41,31,26}, InsertionSort.reverseInsertionSort(new int[]{31, 41, 59, 26, 41, 58}));
    }

    @Test
    void recInsertionSort() {
        int[] array = new int[]{31, 41, 59, 26, 41, 58};
        InsertionSort.recInsertionSort(array);
        Assertions.assertArrayEquals(new int[]{26, 31, 41, 41, 58, 59}, array);
    }

    @Test
    void insertionSortWithBinarySearch() {
        Assertions.assertArrayEquals(new int[]{26, 31, 41, 41, 58, 59}, InsertionSort.insertionSortWithBinarySearch(new int[]{31, 41, 59, 26, 41, 58}));
    }
}