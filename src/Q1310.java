public class Q1310 {
    public int[] xorQueries(int[] a, int[][] q) {
        int[] p = new int[a.length + 1], r = new int[q.length];

        for (int i = 1; i < p.length; i++)
            p[i] = p[i - 1] ^ a[i - 1];

        for (int i = 0; i < q.length; i++)
            r[i] = p[q[i][0]] ^ p[q[i][1] + 1];

        return r;
    }
}
