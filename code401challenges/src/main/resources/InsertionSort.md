# Insertion Sort
## A Step Through Guide

### Description
An insertion sort is a sorting mechanism where the sorted array is built one item at a time. The array items are compared sequentially, and then sorted based on that comparison.

### Psuedo Code
``` InsertionSort(int[] arr)
      
        FOR i = 1 to arr.length
        
          int j <-- i - 1
          int temp <-- arr[i]
          
          WHILE j >= 0 AND temp < arr[j]
            arr[j + 1] <-- arr[j]
            j <-- j - 1
            
          arr[j + 1] <-- temp 
```

### The Step Through

Input: [8, 4, 23, 42, 16, 15]

Pass 1:

![Pass One](./data-structures-and-algorithms/assets/passOne.jpg)

In the first pass of our insertion sort we compare 8 and 4, while 4 is less than the number at the index in front of it (8), we will move it forward.

Pass 2:

![Pass Two](assets/passTwo.jpg)

In the second pass of our insertion sort we will check to see if the number 23 is less than the number in front of it (8), since it is not, no changes will be made to the array.

Pass 3:

![Pass Three](assets/passThree.jpg)

In the third pass of our insertion sort we will check to see if the number 42 is less than the number in front of it (23), since it is not, no changes will be made to the array.

Pass 4:

![AltText](assets/passFour.jpg)

In the fourth pass of our insertion sort we will check to see if the number 16 is less than the number in front of it (42), since it is, we will swap the position of those two elements in the array. Then, we will continue to check if 16 is smaller than the element in front of it now (23), since it is smaller, we will again swap those elements in the array. We will continue to check if 16 is smaller than the number in front of it in the array, (16 vs 8?), when 16 is no longer the smallest number we will end the loop.

Pass 5:

![AltText](assets/passFive.jpg)

In the fifth pass of our insertion sort we will check to see if 15 is smaller than the number in front of it (42), since it is smaller we will swap the two elements. Then we will check to see if 15 is still smaller than the element in front of it (23), since it is smaller we will swap the two elements and continue comparing 15 to the element preceding it. Is 15 smaller than 16? Yes, swap the elements. Is 15 smaller than 8? No, end the loop.

At this time we will have gone through our entire array


### Efficiency

- Time Complexity: Worst case, if the input array is sorted in reverse order, this will have an O(n^2) runtime. Best case, if the input array is already in sorted order it will have an O(n) runtime.

- Space Complexity: Because this algorithm does not create a new array, it will have an O(n) complexity. The space used will be the same as the input array.

