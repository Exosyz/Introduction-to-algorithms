package misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddBinaryIntegerTest {

    @Test
    void add() {
        Assertions.assertArrayEquals(new int[] {1, 0, 0, 0, 0}, AddBinaryInteger.add(new int[]{1,1,1,1}, new int[]{0,0,0,1}));
    }
}