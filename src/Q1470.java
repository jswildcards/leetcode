public class Q1470 {
    public int[] shuffle(int[] a, int n) {
        int[] r = new int[a.length];

        for (int i = 0; i < a.length; i++)
            r[i] = a[i / 2 + (i % 2 * n)];

        return r;
    }
}
