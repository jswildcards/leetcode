public class Q0516 {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] m = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == s.charAt(n - 1 - j))
                    m[i + 1][j + 1] = m[i][j] + 1;
                else
                    m[i + 1][j + 1] = Math.max(m[i][j + 1], m[i + 1][j]);
            }
        }

        return m[n][n];
    }
}
