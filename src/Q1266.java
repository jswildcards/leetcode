public class Q1266 {
    public int minTimeToVisitAllPoints(int[][] p) {
        int r = 0;

        for (int i = 1; i < p.length; i++) {
            r += Math.max(
                    Math.abs(p[i][0] - p[i - 1][0]),
                    Math.abs(p[i][1] - p[i - 1][1])
            );
        }

        return r;
    }
}
