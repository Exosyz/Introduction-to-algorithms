package misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindSumTest {

    @Test
    void findSum() {
        int[] values = new int[]{26, 31, 41, 58, 59};


        Assertions.assertArrayEquals(new int[]{1, 4}, FindSum.findSum(values, 90));
        Assertions.assertArrayEquals(new int[]{}, FindSum.findSum(values, 40));
    }
}