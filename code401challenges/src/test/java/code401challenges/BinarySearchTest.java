package code401challenges;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test public void testBinarySearchFoundValue () {
        int[] inputArray = new int[] {2, 3, 7, 9, 4};
        int inputKey = 9;
        int expected = 3;

        int actual = BinarySearch.binarySearch(inputArray, inputKey);

        Assert.assertTrue(expected == actual);
    }

    @Test public void testBinarySearchValueNotFound () {
        int[] inputArray = new int[] {3, 7, 5, 2, 8};
        int inputKey = 6;
        int expected = -1;

        int actual = BinarySearch.binarySearch(inputArray, inputKey);

        Assert.assertTrue(expected == actual);
    }

    @Test public void testBinarySearchNullArray () {
        int[] inputArray = new int[500];
        int inputKey = 50;
        int expected = -1;

        int actual = BinarySearch.binarySearch(inputArray, inputKey);

        Assert.assertTrue(expected == actual);
    }

    @Test public void testBinarySearchLongArray () {
        int[] inputArray = new int[1000];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = i + 1;
        }

        int inputKey = 42;
        int expected = 41;

        int actual = BinarySearch.binarySearch(inputArray, inputKey);

        Assert.assertTrue(expected == actual);
    }
}
