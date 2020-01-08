package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test public void testArrayShift () {
        int[] expected = new int [] {5, 2, 4, 3, 9};
        int[] input1 = new int[] {5, 2, 3, 9};
        int[] actual = ArrayShift.insertShiftArray(input1, 4);
        assertArrayEquals(expected, actual);
    };

};