public class Q1742 {
    public int countBalls(int s, int e) {
        int[] m = new int[100100];
        int r = 0;

        for (int i = s; i <= e; i++) {
            int q = 0;

            for (int t = i; t > 0; t /= 10)
                q += t % 10;

            r = Math.max(r, ++m[q]);
        }

        return r;
    }
}
