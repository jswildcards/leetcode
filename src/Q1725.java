public class Q1725 {
    public int countGoodRectangles(int[][] a) {
        int m = 0, s = 0, t;

        for (int[] r : a) {
            t = Math.min(r[0], r[1]);

            if (t == m)
                s++;

            if (t > m) {
                m = t;
                s = 1;
            }
        }

        return s;
    }
}
