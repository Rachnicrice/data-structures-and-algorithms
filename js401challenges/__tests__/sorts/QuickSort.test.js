'use strict';

const quickSort = require('../../Sorts/QuickSort.js');

describe('testing quick sort function', () => {

  let sorted = [1, 2, 4, 6, 8, 19];

  it('can sort an array of unique integers', () => {
    let arr = [4, 6, 2, 8, 19, 1];
    let result = quickSort(arr, 0, arr.length - 1);

    expect(result).toEqual(sorted)
  })

  it('can sort an array of duplicate integers', () => {
    let arr = [1, 2, 1, 6, 6, 19];
    let result = quickSort(arr, 0, arr.length - 1);
    let dupSorted = [1, 1, 2, 6, 6, 19];

    expect(result).toEqual(dupSorted)
  });

  it('will return an already sorted array', () => {
    let result = quickSort(sorted, 0, sorted.length - 1);
    expect(result).toEqual(sorted)
  });

});

