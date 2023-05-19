package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

    @Test
    void find() {
        int[] values = new int[]{26, 31, 41, 58, 59};

        Assertions.assertEquals(4, LinearSearch.find(values, 59));
        Assertions.assertEquals(-1, LinearSearch.find(values, 40));
    }
}