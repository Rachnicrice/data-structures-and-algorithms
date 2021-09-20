'use strict';

const insertionSort = require('../../Sorts/InsertionSort.js');

describe('Insertion sort tests', () => {

  let inputArr;
  let sortedArr;

  beforeEach(() => {
    inputArr = [4, 6, 2, 8, 19, 1];
    sortedArr = [1, 2, 4, 6, 8, 19];
  })

  it('can sort an array of unique values', () => {
    let result = insertionSort(inputArr);
    expect(result).toEqual(sortedArr);
  })

  it('can sort an array of duplicate values', () => {
    inputArr = [4, 4, 2, 8, 19, 2];
    let result = insertionSort(inputArr);
    expect(result).toEqual(sortedArr);
  })

  it('will not change an already sorted array', () => {
    let result = insertionSort(sortedArr);
    expect(result).toEqual(sortedArr);
  })

});
