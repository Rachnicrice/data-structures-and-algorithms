package code401challenges.Sorts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    int[] arr;

    @Before
    public void setUp () {
        arr = new int[] {4, 6, 2, 8, 19, 1};
    }

    @Test
    public void testInsertionSort_UniqueValues () {
        assertArrayEquals(new int[]{1, 2, 4, 6, 8, 19}, InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_DuplicateValues () {
        arr = new int[] {4, 4, 2, 8, 19, 2};
        assertArrayEquals(new int[] {2, 2, 4, 4, 8, 19}, InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_ReverseSorted () {
        arr = new int[] {19, 8, 6, 4, 2, 1};
        assertArrayEquals(new int[] {1, 2, 4, 6, 8, 19}, InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_Sorted () {
        arr = new int[] {1, 2, 4, 6, 8, 19};
        assertArrayEquals(new int[] {1, 2, 4, 6, 8, 19}, InsertionSort.insertionSort(arr));
    }
}
