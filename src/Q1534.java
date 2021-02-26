public class Q1534 {
    public int countGoodTriplets(int[] p, int a, int b, int c) {
        int r = 0;

        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (Math.abs(p[i] - p[j]) > a)
                    continue;

                for (int k = j + 1; k < p.length; k++) {
                    if (Math.abs(p[i] - p[k]) <= c && Math.abs(p[j] - p[k]) <= b)
                        r++;
                }
            }
        }

        return r;
    }
}
