public class Q0053 {
    public int maxSubArray(int[] a) {
        int m = a[0], c = 0;

        for (int e : a) {
            if(c < 0)
                c = 0;

            c += e;
            m = Math.max(m, c);
        }

        return m;
    }
}
