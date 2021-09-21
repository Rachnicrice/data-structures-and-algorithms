'use strict';

const mergeSort = require('../../Sorts/MergeSort.js');

describe('Merge sort tests', () => {

  let arr;
  let sorted;

  beforeEach(() => {
    arr = [4, 6, 2, 8, 19, 1];
    sorted = [1, 2, 4, 6, 8, 19];
  })

  it('can sort an array of unique values', () => {
    let result = mergeSort(arr);
    expect(result).toEqual(sorted);
  })

  it('can sort an array of duplicate values', () => {
    arr = [1, 2, 1, 6, 6, 19];
    sorted =[1, 1, 2, 6, 6, 19];
    let result = mergeSort(arr);
    expect(result).toEqual(sorted);
  })

  it('can sort an array that is already sorted', () => {
    let result = mergeSort(sorted);
    expect(result).toEqual(sorted);
  })

});
