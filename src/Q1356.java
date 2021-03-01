import java.util.Arrays;

public class Q1356 {
    public int[] sortByBits(int[] a) {
        Arrays.sort(a);
        int p = 0, n = a.length;
        int[][] m = new int[20][n + 1];

        for (int e : a) {
            int[] r = m[Integer.bitCount(e)];
            r[r[n]++] = e;
        }

        for(int[] r : m) {
            for(int i = 0; i < r[n]; i++)
                a[p++] = r[i];
        }

        return a;
    }
}
