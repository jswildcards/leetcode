public class Q0474 {
    Integer[][][] g;
    int[][] h;

    int r(String[] a, int m, int n, int s) {
        if (a.length <= s)
            return 0;

        if (g[s][m][n] != null)
            return g[s][m][n];

        int c = h[s][0] > m || h[s][1] > n ?
                Integer.MIN_VALUE :
                r(a, m - h[s][0], n - h[s][1], s + 1) + 1;
        g[s][m][n] = Math.max(c, r(a, m, n, s + 1));
        return g[s][m][n];
    }

    public int findMaxForm(String[] a, int m, int n) {
        g = new Integer[a.length][m + 1][n + 1];
        h = new int[a.length][2];

        for(int i = 0; i < a.length; i++) {
            for (char c : a[i].toCharArray())
                h[i][c - '0']++;
        }

        return r(a, m, n, 0);
    }
}
