'use strict';

const mergeSort = (arr) => {
  let n = arr.length;

  if (n > 1) {
    let mid = n/2;
    let left = arr.slice(0, mid);
    let right = arr.slice(mid, n);

    mergeSort(left);
    mergeSort(right);

    mergeSortHelper(left, right, arr);
  }
  return arr;
}

const mergeSortHelper = (left, right, arr) => {
  let i = 0;
  let j = 0;
  let k = 0;

  while (i < left.length && j < right.length) {
    if (left[i] <= right[j]) {
      arr[k] = left[i];
      i++;
    } else {
      arr[k] = right[j];
      j++;
    }
    k++;
  }

  if (i === left.length) {
    for (let z = k; z < arr.length; z++){
      arr[z] = right[j];
      j++;
    }
  } else {
    for (let z = k; z < arr.length; z++){
      arr[z] = left[i];
      i++;
    }
  }

  return arr;
}

module.exports = mergeSort;
