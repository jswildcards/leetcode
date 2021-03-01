public class Q0268 {
    public int missingNumber(int[] a) {
        int r = a.length;

        for(int i = 0; i < a.length; i++)
            r ^= i ^ a[i];

        return r;
    }
}
