package misc;

import java.util.HashMap;

public class FindSum {
    protected static int[] findSum(int[] a, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int r = x - a[i];
            if (map.containsKey(r))
                return new int[]{map.get(r), i};

            map.put(a[i], i);
        }

        return new int[]{};
    }
}
