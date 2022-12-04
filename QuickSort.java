public class QuickSort {

    public static void main(String[] args) {
        int[] array = {8, 9, 17, 6, 25, 4, 13, 2, 1};

        quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void quickSort(int[] array, int low, int high) {

        if (low < high) {
            int index = getPartition(array, low, high);
            quickSort(array, low, index - 1);
            quickSort(array, index + 1, high);

        }

    }

    private static int getPartition(int[] array, int low, int high) {

        int pivot = array[high];
        //i as a marker for lower subarray
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }

        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
