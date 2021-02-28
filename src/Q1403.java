import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q1403 {
    public List<Integer> minSubsequence(int[] a) {
        int d = 0;
        List<Integer> r = new LinkedList<>();
        Arrays.sort(a);

        for (int e : a)
            d += e;

        for (int i = a.length - 1; i > -1; i--) {
            r.add(a[i]);
            d -= 2 * a[i];

            if(d < 0)
                break;
        }

        return r;
    }
}
