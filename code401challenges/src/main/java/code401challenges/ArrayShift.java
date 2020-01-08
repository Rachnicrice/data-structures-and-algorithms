package code401challenges;

import java.lang.reflect.Array;

public class ArrayShift {

    public static int[] insertShiftArray (int[] array, int addThisInt) {
        int mid = array.length/2;
        int[] arrayWithAddedInt = new int[array.length + 1];

        for (int i = 0; i < arrayWithAddedInt.length; i++) {
            if (i < mid) {
                arrayWithAddedInt[i] = array[i];
            } else if (i == mid) {
                arrayWithAddedInt[mid] = addThisInt;
            } else {
                arrayWithAddedInt[i] = array[i-1];
            }
        }
     return arrayWithAddedInt;
    }

}
