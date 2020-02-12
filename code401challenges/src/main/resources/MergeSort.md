# Merge Sort
## A Step Through Guide

### Description
A merge sort is a sorting mechanism 

### Psuedo Code
``` ALGORITHM Mergesort(arr)
        DECLARE n <-- arr.length
               
        if n > 1
          DECLARE mid <-- n/2
          DECLARE left <-- arr[0...mid]
          DECLARE right <-- arr[mid...n]
          // sort the left side
          Mergesort(left)
          // sort the right side
          Mergesort(right)
          // merge the sorted left and right sides together
          Merge(left, right, arr)
    
    ALGORITHM Merge(left, right, arr)
        DECLARE i <-- 0
        DECLARE j <-- 0
        DECLARE k <-- 0
    
        while i < left.length && j < right.length
            if left[i] <= right[j]
                arr[k] <-- left[i]
                i <-- i + 1
            else
                arr[k] <-- right[j]
                j <-- j + 1
                
            k <-- k + 1
    
        if i = left.length
           set remaining entries in arr to remaining values in right
        else
           set remaining entries in arr to remaining values in left
```

### The Step Through

Input: [8, 4, 23, 42, 16, 15]

Pass 1:

![Call One](./data-structures-and-algorithms/assets/passOne.jpg)

In the first call 

Pass 2:

![Call Two](assets/passTwo.jpg)

In the second call

Pass 3:

![Call Three](assets/passThree.jpg)

In the third call 

Pass 4:

![Call Four](assets/passFour.jpg)

In the fourth call 

Pass 5:

![Call Five](assets/passFive.jpg)

In the fifth call


### Efficiency

- Time Complexity: 

- Space Complexity: 