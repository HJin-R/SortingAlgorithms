import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {10, 4, 16, 21, 7, 42, 8, 9, 50, 6, 3};

        for (int i : bubbleSort(input)) {
            System.out.print(i + " ");
        }
    }


    //returns sorted array
    private static int[] bubbleSort(int[] array) {

        int[] copy = Arrays.copyOf(array, array.length);
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < copy.length - 1; i++) {
                if (copy[i] > copy[i + 1]) {
                    int temp = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return copy;

    }
}
