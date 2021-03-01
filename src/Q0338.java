// |1000| = |100| + 0
// |1001| = |100| + 1

public class Q0338 {
    public int[] countBits(int n) {
        int[] r = new int[n + 1];

        for (int i = 1; i < r.length; i++)
            r[i] = r[i >> 1] + i % 2;

        return r;
    }
}
