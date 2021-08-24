# Merge Sort
## A Step Through Guide

### Description
A merge sort is a sorting mechanism that divides an array into sub-arrays until it is as small as possible. Aka, until each sub array contains only one item. Then it will merge those sub lists back together, by comparing two sub-arrays at a time and putting the one with the smaller value first. As it rejoins these arrays, it moves back up the call stack until you have two remaining sorted sub-arrays, which are then 'merged' together.

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

First Call:
When you first call the wrapper Mergesort(arr) function, n will be declared as the length of the array (6). This number will then be divided by two (3), and a new array 'left' will be declared as arr[8, 4, 23], and a new array 'right' will be declared as arr[42, 16, 15]. A recursive call will then be made on the new left array (Mergesort(left)), and a recursive call will be made on the new right array (Mergesort(right)).

Left Call:

![Left Call](assets/left.jpg)

When the call is made on the left array [8, 4, 23] it will be passed into the Mergesort function as the arr parameter. It will then be divided in half again, making left [8], and right [4, 23]. This will trigger another recursive call on the left [8], but since it's length is not greater 1 no code will execute.   

Next a recursive call will be made on the right array, and it will be split once more into left [4] and right [23]. The code will then proceed to call Mergesort(left, right, arr (aka [4, 23])). The left and right will be compared, and sorted as [4, 23].  

We will then move back up the call stack and Mergesort will be called with the parameters left[8], right [4, 23], arr [8, 4, 23]. The first value in the left array will be compared with the first value in the right array (8 & 4), since the right array value is smaller than the left array value it will be resorted as [4, 8, 23]

Right Call:

![Right Call](assets/right.jpg)

Once all the calls on the left array have executed, a recursive call will be made on the right array [42, 16, 15]. The right array will be passed into the Mergesort function as the parameter arr. It will then be divided in half again, with left re-declared as [42] and right as [16, 15]. A recursive call will then be made on the left array [42], but since it's length is not greater than 1, no code will execute.

Next, a recursive call will be made on the right array [16, 15], it will be split into left [16] and right [15]. Mergesort will then be called with the parameters left[16], right[15], and arr [16, 15]. The left and right will be compared and re-sorted into arr as [15, 16].

We will then move back up the call stack and Mergesort will be called with the parameters left[42], right [15, 16], arr [42, 16, 15]. The first value in the left array will be compared with the first value in the right array (8 & 4), since the right array value is smaller than the left array value it will be resorted as [15, 16, 42]

Final Call:

![Merge](assets/merge.jpg)

Once the left calls and the right calls have been completed and popped off the call stack, merge(left, right, arr) is called  with the parameters left [4, 8, 23], right [15, 16, 42] and arr [8, 4, 23, 42, 16, 15]. 

The first element in the left array will be compared to the first element in the right array (4 & 15). Since 4 is smaller it will be placed at the front of arr. Then the second element in the left array will be compared to the first element in the right array (8 & 15), since 8 is smaller it will be placed next in the array. 

Right now arr might look something like:  
[4, 8, 23, 42, 16, 15]

Then the third element in the left array will be compared to the first element in the right array (23 & 15). Since 15 is the smaller number it will be assigned as the next value in arr.

Now arr looks like this:  
[4, 8, 15, 42, 16, 15]

Then 23 will be compared to 16 which is the next element in the right array. Since 16 is smaller it will be assigned to arr:  
[4, 8, 15, 16, 16, 15]

And finally 23 will be compared to 42. Since 23 is smaller it will be assigned to arr. And since we have traversed the entirety of our left array, the remaining values in the right arr will be assigned to the end of arr.

Finally, arr will look like this:  
[4, 8, 15, 16, 23, 42]


### Efficiency

- Time Complexity: The time complexity of Mergesort is O(nLogn) in both best and worst case scenarios.

- Space Complexity: The space complexity of Mergesort is O(n) since it will not modify the length of the original array or create a new array to return.
