import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] values = new int[]{31, 41, 59, 26, 41, 58};
        System.out.println("Original Array :");
        System.out.println(Arrays.toString(values));
        System.out.println("Monotonically increasing sorted array :");
        System.out.println(Arrays.toString(insertionSort(values)));
        System.out.println("Monotonically decreasing sorted array :");
        System.out.println(Arrays.toString(reverseInsertionSort(values)));
    }

    protected static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];

            int checkIndex = i-1;
            while (checkIndex >= 0 && array[checkIndex] > currentValue) {
                array[checkIndex + 1] = array[checkIndex];
                checkIndex -= 1;
            }
            array[checkIndex + 1] = currentValue;
        }
        return array;
    }

    protected static int[] reverseInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];

            int checkIndex = i-1;
            while (checkIndex >= 0 && array[checkIndex] < currentValue) {
                array[checkIndex + 1] = array[checkIndex];
                checkIndex -= 1;
            }
            array[checkIndex + 1] = currentValue;
        }
        return array;
    }
}