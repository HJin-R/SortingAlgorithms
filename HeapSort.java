public class HeapSort {

    public static void main(String[] args) {

        int[] source = {4, 7, 30, 19, 2, 15, 3, 5, 10, 7, 20, 1, 6};
        heapSort(source);
        for (int i : source) {
            System.out.print(i + " ");
        }
    }

    static void heapSort(int[] array) {
        int n = array.length;
        //build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(array, n, i);
        }

        //extract the largest element and swap with the last element
        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            maxHeapify(array, i, 0);
        }

    }



    // n is size of heap
    static void maxHeapify(int[] array, int n, int i) {
        //initialise largest as root
        int largest = i;  //largest element

        int l = (i * 2) + 1;  //left child
        int r = (i * 2) + 2;  //right child

        if (l < n && array[l] > array[largest]) {
            largest = l;
        }

        if (r < n && array[r] > array[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            maxHeapify(array, n, largest); 
        }
    }



}
