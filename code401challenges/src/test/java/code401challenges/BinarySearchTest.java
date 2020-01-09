package code401challenges;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test public void testBinarySearch () {
        int[] inputArray = new int[] {2, 3, 7, 9, 4};
        int inputKey = 9;
        int expected = 3;

        int actual = BinarySearch.binarySearch(inputArray, inputKey);

        Assert.assertTrue(expected == actual);
    }
}
