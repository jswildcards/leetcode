public class Q1491 {
    public double average(int[] a) {
        int r = 0, p = Integer.MAX_VALUE, q = Integer.MIN_VALUE;

        for (int e : a) {
            p = Math.min(p, e);
            q = Math.max(q, e);
            r += e;
        }

        return (double) (r - p - q) / (a.length - 2);
    }
}
