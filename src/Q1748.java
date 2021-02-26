public class Q1748 {
    public int sumOfUnique(int[] a) {
        int[] m = new int[101];
        int r = 0;

        for (int c : a)
            r += ++m[c] == 1 ? c : (m[c] == 2 ? -c : 0);

        return r;
    }
}
