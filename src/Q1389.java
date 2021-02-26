import java.util.LinkedList;
import java.util.List;

public class Q1389 {
    public int[] createTargetArray(int[] a, int[] b) {
        List<Integer> m = new LinkedList<>();
        int j = 0;

        for (int i = 0; i < a.length; i++)
            m.add(b[i], a[i]);

        for (Integer i : m.toArray(Integer[]::new))
            a[j++] = i;

        return a;
    }
}
