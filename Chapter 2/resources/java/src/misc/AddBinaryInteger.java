package misc;

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
}
