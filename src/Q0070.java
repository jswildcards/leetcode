public class Q0070 {
    public int climbStairs(int n) {
        if (n < 3)
            return n;

        int p = 1, q = 2;

        for (int i = 3; i <= n; i++) {
            int t = q;
            q += p;
            p = t;
        }

        return q;
    }
}
