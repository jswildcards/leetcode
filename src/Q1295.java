public class Q1295 {
    public int findNumbers(int[] a) {
        int r = a.length;

        for(int e : a)
            r -= String.valueOf(e).length() % 2;

        return r;
    }
}
