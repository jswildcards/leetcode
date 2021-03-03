public class Q1299 {
    public int[] replaceElements(int[] a) {
        int m = -1;

        for (int i = a.length - 1; i > -1; i--) {
            int t = a[i];
            a[i] = m;
            m = Math.max(m, t);
        }

        return a;
    }
}
