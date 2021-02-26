public class Q1672 {
    public int maximumWealth(int[][] a) {
        int m = -1;

        for (int[] r : a) {
            int w = 0;
            for (int e : r)
                w += e;
            m = Math.max(w, m);
        }

        return m;
    }
}
