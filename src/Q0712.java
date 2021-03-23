public class Q0712 {
    Integer[][] m;

    int r(String s, String t, int i, int j) {
        if (i >= s.length() && j >= t.length())
            return 0;

        if (m[i][j] != null)
            return m[i][j];

        if (i >= s.length())
            m[i][j] = t.charAt(j) + r(s, t, i, j + 1);
        else if (j >= t.length())
            m[i][j] = s.charAt(i) + r(s, t, i + 1, j);
        else if (s.charAt(i) == t.charAt(j))
            m[i][j] = r(s, t, i + 1, j + 1);
        else
            m[i][j] = Math.min(s.charAt(i) + r(s, t, i + 1, j), t.charAt(j) + r(s, t, i, j + 1));

        return m[i][j];
    }


    public int minimumDeleteSum(String s, String t) {
        m = new Integer[s.length() + 1][t.length() + 1];
        return r(s, t, 0, 0);
    }
}
