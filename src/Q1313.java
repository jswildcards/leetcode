import java.util.Arrays;

public class Q1313 {
    public int[] decompressRLElist(int[] a) {
        int s = 0;

        for (int i = 0; i < a.length; i += 2)
            s += a[i];

        int[] r = new int[s];
        s = 0;

        for (int i = 0; i < a.length; i += 2)
            Arrays.fill(r, s, s += a[i], a[i + 1]);

        return r;
    }
}
