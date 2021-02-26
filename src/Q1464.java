public class Q1464 {
    public int maxProduct(int[] a) {
        int p = 0, q = 0;

        for (int e : a) {
            if (e > p) {
                q = p;
                p = e;
            } else if (e > q)
                q = e;
        }

        return (p - 1) * (q - 1);
    }
}
