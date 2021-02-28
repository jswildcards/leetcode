public class Q1217 {
    public int minCostToMoveChips(int[] a) {
        int[] p = {0, 0};

        for (int e : a)
            p[e % 2]++;

        return Math.min(p[0], p[1]);
    }
}
