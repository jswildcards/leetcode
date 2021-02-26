public class Q1480 {
    public int[] runningSum(int[] a) {
        for (int i = 1; i < a.length; i++)
            a[i] += a[i - 1];

        return a;
    }
}
