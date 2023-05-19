package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void search() {
        int[] values = new int[]{26, 31, 41, 58, 59};

        Assertions.assertEquals(4, BinarySearch.search(values, 59));
        Assertions.assertEquals(-1, BinarySearch.search(values, 40));
    }

    @Test
    void searchPosition() {
        int[] values = new int[]{26, 31, 41, 58, 59};

        Assertions.assertEquals(4, BinarySearch.searchPosition(values, 59));
        Assertions.assertEquals(2, BinarySearch.searchPosition(values, 40));
    }
}