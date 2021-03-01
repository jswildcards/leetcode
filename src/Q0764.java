public class Q0764 {
    int[] r;

    int m(int[] c, int e) {
        if (e < 2)
            return c[e];

        if(r[e] > 0)
            return r[e];

        r[e] = Math.min(m(c, e - 1), m(c, e - 2)) + (e >= c.length ? 0 : c[e]);
        return r[e];
    }

    public int minCostClimbingStairs(int[] c) {
        r = new int[c.length + 1];
        return m(c, c.length);
    }
}
