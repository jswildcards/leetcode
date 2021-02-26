public class Q1486 {
    public int xorOperation(int n, int t) {
        int r = t;

        for (int i = 1; i < n; i++)
            r ^= t + 2 * i;

        return r;
    }
}
