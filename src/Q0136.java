public class Q0136 {
    public int singleNumber(int[] a) {
        int r = 0;

        for(int e : a)
            r ^= e;

        return r;
    }
}
