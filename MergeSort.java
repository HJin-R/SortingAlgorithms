import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] source = {7, 19, 4, 39, 12, 41, 10, 5, 1, 6, 3};

        mergeSort(source);
        //sorted array
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }

    }

    private static void mergeSort(final int[] array) {

        int n = array.length;
        if (n < 2) {
            return;
        }

        int mid = n / 2;

        int[] l = Arrays.copyOf(array, mid);
        int[] r = Arrays.copyOf(array, n - mid);

        //left subarray
        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        //right subarray
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }

        //recursive calls
        mergeSort(l);
        mergeSort(r);
        //merge
        merge(array, l, r);


    }


    private static int[] merge(int[] array, int[] left, int[] right) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }

        return array;
    }

}
