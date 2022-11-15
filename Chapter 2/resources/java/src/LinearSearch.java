import java.util.Arrays;

public class LinearSearch {
    protected static Integer find(int[] array, int search_value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search_value)
                return i;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] values = new int[]{31, 41, 59, 26, 41, 58};
        System.out.println("Original Array :");
        System.out.println(Arrays.toString(values));
        System.out.println("Index of 59 : " + LinearSearch.find(values, 59));
        System.out.println("Index of 40 : " + LinearSearch.find(values, 40));
    }
}
