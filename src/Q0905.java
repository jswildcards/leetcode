public class Q0905 {
    public int[] sortArrayByParity(int[] a) {
        int n = a.length, i = 0, j = n - 1;
        int[] r = new int[n];

        for (int e : a)
            r[e % 2 == 0 ? i++ : j--] = e;

        return r;
    }
}
