public class Q1732 {
    public int largestAltitude(int[] a) {
        int m = 0, s = 0;

        for (int e : a)
            m = Math.max(m, s += e);

        return m;
    }
}
