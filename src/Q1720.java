public class Q1720 {
    public int[] decode(int[] a, int n) {
        int[] r = new int[a.length + 1];
        r[0] = n;

        for (int i = 0; i < a.length; i++)
            r[i + 1] = r[i] ^ a[i];

        return r;
    }
}
