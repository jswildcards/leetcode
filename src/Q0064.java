public class Q0064 {
    public int minPathSum(int[][] g) {
        int m = g.length, n = g[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    continue;

                int t = i > 0 ? g[i - 1][j] : Integer.MAX_VALUE;
                int l = j > 0 ? g[i][j - 1] : Integer.MAX_VALUE;
                g[i][j] += Math.min(t, l);
            }
        }

        return g[m - 1][n - 1];
    }
}
