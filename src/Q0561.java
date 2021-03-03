import java.util.Arrays;

public class Q0561 {
    public int arrayPairSum(int[] a) {
        int r = 0;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i += 2)
            r += a[i];

        return r;
    }
}
