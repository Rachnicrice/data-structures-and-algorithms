# Quick Sort
## A Step Through Guide

### Description
A quick sort is a sorting mechanism that reorganizes an array by dividing them around a pivot. In this way, it is similar to Mergesort, however instead of dividing an array in half it will pick a pivot from either the front of the array, the end or at random. Two sub arrays will them be created around the pivot with one side containing all the values that are smaller and the other array containing all the values that are larger.

### Psuedo Code
``` ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value 
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)
    
    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)
    
         // place the value of the pivot location in the middle.
         // all numbers smaller than the pivot are on the left, larger on the right. 
         Swap(arr, right, low + 1)
        // return the pivot index point
         return low + 1
    
    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp 
```

### The Step Through

Input: [8, 4, 23, 42, 16, 15]

First Call:
When quicksort is first called it will choose a pivot point (which in our algorithm will be the rightmost value of the input array). It will then compare all the values in the array from left to right, to the pivot to see if it's value is larger or smaller. If the element being compared is smaller than the pivot, it will be moved to the left of the pivot, if it is larger it will be moved to the right side of the pivot. After the first call of quicksort our array might look something like this:

![First Sort](assets/q1.jpg)

Subsequent Calls:

Quicksort is a recursive function, so once the first sort has completed, quicksort will be called again on all the elements smaller than the pivot (everything on the left) and all the elements larger (all the elements on the right). It will then chose the rightmost element of this sub-array, and treat that as the new pivot. It will then sort the sub-array with items smaller to the left of the pivot, items larger to the right, and re-call quicksort on these two halves until the array is eventually completely sorted.

![All the Sorts](assets/q2.jpg)


### Efficiency

- Time Complexity: Worst case (which could occur if the array is already sorted, or if the greatest or smallest number is always picked as the pivot) quicksort will have an O(n^2) runtime. Best case (if the middle value is always picked as the pivot) it would have an O(nLogn) time complexity.

- Space Complexity: The space complexity will always be O(n) since the array is modified in place.