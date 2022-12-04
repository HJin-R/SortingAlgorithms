public class Insertion {
    public static void main(String[] args) {
        int[] source = {4, 8, 6, 2, 7, 1, 9, 3, 5};
        insertionSort(source);
        for (int i : source) {
            System.out.print(i + " ");
        }

    }


    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j -1;
            }

            array[j + 1] = key;
        }
    }
}
