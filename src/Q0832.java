public class Q0832 {
    public int[][] flipAndInvertImage(int[][] a) {
        int n = a.length, t;

        for (int[] r : a) {
            for (int i = 0; i < (n + 1) / 2; i++) {
                t = r[i];
                r[i] = r[n - 1 - i] ^ 1;
                r[n - 1 - i] = t ^ 1;
            }
        }

        return a;
    }
}
