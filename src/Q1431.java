import java.util.LinkedList;
import java.util.List;

public class Q1431 {
    public List<Boolean> kidsWithCandies(int[] a, int c) {
        List<Boolean> l = new LinkedList<>();
        int m = -1;

        for (int e : a)
            m = Math.max(m, e);

        for (int e : a)
            l.add(c + e >= m);

        return l;
    }
}
