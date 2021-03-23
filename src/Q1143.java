public class Q1143 {
    public int longestCommonSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        int[][] p = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == t.charAt(j))
                    p[i + 1][j + 1] = p[i][j] + 1;
                else
                    p[i + 1][j + 1] = Math.max(p[i][j + 1], p[i + 1][j]);
            }
        }

        return p[m][n];
    }
}
