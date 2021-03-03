public class Q0983 {
    int[] m;

    int r(int[] d, int[] c, int s) {
        if (s >= d.length)
            return 0;

        if (m[s] > 0)
            return m[s];

        m[s] = c[0] + r(d, c, s + 1);

        int f = s;
        while (f < d.length && d[f] - d[s] < 7)
            f++;
        m[s] = Math.min(m[s], c[1] + r(d, c, f));

        f = s;
        while (f < d.length && d[f] - d[s] < 30)
            f++;
        m[s] = Math.min(m[s], c[2] + r(d, c, f));

        return m[s];
    }

    public int mincostTickets(int[] d, int[] c) {
        m = new int[d.length];
        return r(d, c, 0);
    }
}
