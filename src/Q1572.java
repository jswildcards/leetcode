public class Q1572 {
    public int diagonalSum(int[][] a) {
        int s = 0, n = a.length;

        for (int i = 0; i < n; i++)
            s += a[i][i] + a[i][n - 1 - i];

        return s - (n % 2 == 1 ? a[n / 2][n / 2] : 0);
    }
}
