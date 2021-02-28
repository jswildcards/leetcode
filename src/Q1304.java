public class Q1304 {
    public int[] sumZero(int n) {
        int[] a = new int[n];

        for (int i = 1; i <= n / 2; i++) {
            a[i - 1] = i;
            a[n - i] = -i;
        }

        return a;
    }
}
