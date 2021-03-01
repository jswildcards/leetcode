public class Q0121 {
    public int maxProfit(int[] a) {
        int r = 0, m = a[0];

        for (int e : a) {
            r = Math.max(r, e - m);
            m = Math.min(m, e);
        }

        return r;
    }
}
