import java.util.Arrays;

public class AddBinaryInteger {
    protected static int[] add(int[] a, int[] b) {
        int[] c = new int[a.length + 1];

        int remainder = 0;
        for (int i = c.length - 1; i > 1; i--) {
            c[i] = (a[i-1] + b[i-1] + remainder) % 2;
            remainder = (a[i-1] + b[i-1] + remainder) / 2;
        }
        c[0] = remainder;

        return c;
    }

    public static void main(String[] args) {
        // A and B need to have the same length
        int[] a = new int[]{1,1,1,1};
        int[] b = new int[]{0,0,0,1};

        System.out.println(Arrays.toString(a) + " + " + Arrays.toString(b) + " = " + Arrays.toString(AddBinaryInteger.add(a, b)));
    }
}
