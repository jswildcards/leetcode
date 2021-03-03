public class Q0931 {
    Integer[][] g;

    int r(int[][] m, int x, int y) {
        if (x == m.length - 1)
            return m[x][y];

        if (g[x][y] != null)
            return g[x][y];

        int b = r(m, x + 1, y);
        if (y > 0)
            b = Math.min(r(m, x + 1, y - 1), b);
        if (y < m.length - 1)
            b = Math.min(r(m, x + 1, y + 1), b);

        g[x][y] = b + m[x][y];
        return g[x][y];
    }

    public int minFallingPathSum(int[][] m) {
        int r = Integer.MAX_VALUE;
        g = new Integer[m.length][m.length];

        for (int i = 0; i < m.length; i++)
            r = Math.min(r, r(m, 0, i));

        return r;
    }
}
