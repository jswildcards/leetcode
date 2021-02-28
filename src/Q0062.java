public class Q0062 {
    public int uniquePaths(int m, int n) {
        int[][] g = new int[m + 1][n + 1];
        g[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                g[i + 1][j] += g[i][j];
                g[i][j + 1] += g[i][j];
            }
        }

        return g[m - 1][n - 1];
    }
}
