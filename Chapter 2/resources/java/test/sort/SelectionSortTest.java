package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

    @Test
    void selectionSort() {
        Assertions.assertArrayEquals(new int[]{26, 31, 41, 41, 58, 59}, SelectionSort.selectionSort(new int[]{31, 41, 59, 26, 41, 58}));
    }
}