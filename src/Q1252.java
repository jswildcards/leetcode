public class Q1252 {
    public int oddCells(int n, int m, int[][] a) {
        int[] r = new int[n], c = new int[m], q = {0, 0};

        for (int[] p : a) {
            r[p[0]] ^= 1;
            c[p[1]] ^= 1;
        }

        for (int e : r)
            q[0] += e;

        for (int e : c)
            q[1] += e;

        return q[0] * (m - q[1]) + q[1] * (n - q[0]);
    }
}
