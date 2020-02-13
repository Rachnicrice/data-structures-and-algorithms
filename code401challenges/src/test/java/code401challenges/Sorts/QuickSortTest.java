package code401challenges.Sorts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    int[] arr;

    @Before
    public void setUp () {
        arr = new int[] {4, 6, 2, 8, 19, 1};
    }

    @Test
    public void testQuickSort_UniqueValues () {
        QuickSort.Quicksort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] {1, 2, 4, 6, 8, 19}, arr);
    }

    @Test
    public void testQuickSort_DuplicateValues () {
        arr = new int[] {1, 2, 1, 6, 6, 19};
        QuickSort.Quicksort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] {1, 1, 2, 6, 6, 19}, arr);
    }

    @Test
    public void testQuickSort_ReverseSorted () {
        arr = new int[] {19, 8, 6, 4, 2, 1};
        QuickSort.Quicksort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] {1, 2, 4, 6, 8, 19}, arr);
    }

    @Test
    public void testQuickSort_NearlySorted () {
        arr = new int[] {1, 2, 4, 6, 19, 8};
        QuickSort.Quicksort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] {1, 2, 4, 6, 8, 19}, arr);
    }
}
