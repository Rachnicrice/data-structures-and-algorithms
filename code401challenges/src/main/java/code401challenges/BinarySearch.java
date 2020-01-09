package code401challenges;

public class BinarySearch {

    public static int binarySearch (int [] sortedArray, int searchKey) {
        int index = -1;

        int startSearchRange = 0;
        int endSearchRange = sortedArray.length -1;

        while (startSearchRange <= endSearchRange) {
            int middle = (startSearchRange + endSearchRange)/2;
            if (sortedArray[middle] == searchKey) {
                index = middle;
                endSearchRange = -1;

            } else if (sortedArray[middle] > searchKey) {
                endSearchRange--;

            } else if (sortedArray[middle] < searchKey) {
                startSearchRange++;
            }
        }
        return index;
    }
}
