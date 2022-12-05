//Java implementation of binary search
public class BinarySearch {

    //search an item in the sorted array
    int binarySearch(final int[] sortedArray, int key) {  //key as an item to find
        int low = 0;
        int high = sortedArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (key > sortedArray[mid]) {
                low = mid + 1;
            } else if (key < sortedArray[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    //recursive method
     int binarySearchRecursively(int[] sortedArray, int key, int low, int high) {
        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (key < sortedArray[mid]) {
            return binarySearchRecursively(sortedArray, key, low, mid - 1);
        } else if (key > sortedArray[mid]) {
            return binarySearchRecursively(sortedArray, key, mid + 1, high);
        } else {
            return mid;
        }

    } 

}

