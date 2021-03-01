public class Q0762 {
    public int countPrimeSetBits(int l, int r) {
        int m = 0;
        int[] p = new int[25];
        p[2] = p[3] = p[5] = p[7] = p[11] = p[13] = p[17] = p[19] = p[23] = 1;

        for (int i = l; i <= r; i++)
            m += p[Integer.bitCount(i)];

        return m;
    }
}
