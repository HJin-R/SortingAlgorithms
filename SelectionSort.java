public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 22, 14, 2, 6, 28, 3, 41, 4};

        selectionSort(numbers);
        //sorted array
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(final int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            //looking for min value
            int minValueIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minValueIndex]) {
                    minValueIndex = j;
                }
            }

            //swap positions
            if (minValueIndex != i) {
                int temp = array[i];
                array[i] = array[minValueIndex];
                array[minValueIndex] = temp;
            }
        }


    }

}
