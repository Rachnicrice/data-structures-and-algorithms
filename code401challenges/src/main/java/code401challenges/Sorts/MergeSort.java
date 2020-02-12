package code401challenges.Sorts;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort (int[] arr) {
        int n = arr.length;

        if (n > 1) {
            int mid = n/2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);

            mergeSort(left);
            mergeSort(right);

            mergeSort(left, right, arr);
        }
        return arr;
    }

    public static int[] mergeSort(int[] left, int[] right, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;

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

        if (i == left.length) {
            for (int z = k; z < arr.length; z++){
                arr[z] = right[j];
                j++;
            }
        } else {
            for (int z = k; z < arr.length; z++){
                arr[z] = left[i];
                i++;
            }
        }

        return arr;
    }

}
