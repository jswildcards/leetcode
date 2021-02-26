public class Q1365 {
    public int[] smallerNumbersThanCurrent(int[] a) {
        int[] c = new int[102];

        for (int e : a)
            c[e + 1]++;

        for (int i = 1; i < c.length; i++)
            c[i] += c[i - 1];

        for (int i = 0; i < a.length; i++)
            a[i] = c[a[i]];

        return a;
    }
}
