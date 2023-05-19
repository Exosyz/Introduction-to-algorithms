package search;

public class BinarySearch {
    public static int search(int[] a, int x) {
        return recSearch(a, 0, a.length - 1, x);
    }

    public static int recSearch(int[] a, int h, int t, int x) {
        if (h > t)
            return -1;

        int m = h + (t - h) / 2;

        if (a[m] == x)
            return m;
        else if (a[m] > x)
            return recSearch(a, h, m -1, x);
        else
            return recSearch(a, m+1, t, x);
    }

    protected static int searchPosition(int[] a, int x) {
        return recSearchPosition(a, 0, a.length, x);
    }

    public static int recSearchPosition(int[] a, int h, int t, int x) {
        while (h <= t) {
            int m = (h + t) / 2;
            if (a[m] == x) {
                return m;
            } else if (a[m] < x) {
                h = m + 1;
            } else {
                t = m - 1;
            }
        }
        return h;
    }
}
