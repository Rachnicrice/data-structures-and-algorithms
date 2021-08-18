## Challenge 01
The problem domain for this challenge was to create a function which takes an array and a value to be added and return an array with the value added to the middle index.

## Approach & Efficiency
I decided to create a new array instead of modifying the existing one.

## Solution
I first found the midpoint of the input array, then I copied the first half of the input array into my new array. At the midpoint I added the value to my new array, then finally I copied the remainder of the input array.

![Whiteboard](../assets/array-insert-shift.png)
