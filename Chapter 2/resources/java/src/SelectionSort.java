import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] values = new int[]{31, 41, 59, 26, 41, 58};
        System.out.println("Original Array :");
        System.out.println(Arrays.toString(values));
        System.out.println("Monotonically increasing sorted array :");
        System.out.println(Arrays.toString(selectionSort(values)));
    }

    protected static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int small = i;

            for (int j = i; j < array.length; j++)
                if (array[j] < array[small])
                    small = j;

            int swap = array[small];
            array[small] = array[i];
            array[i] = swap;
        }

        return array;
    }
}
