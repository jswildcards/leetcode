import java.util.HashMap;
import java.util.Map;

public class Q1512 {
    public int numIdenticalPairs(int[] a) {
        Map<Integer, Integer> m = new HashMap<>();
        int r = 0;

        for (int e : a)
            m.put(e, (m.getOrDefault(e, 0)) + 1);

        for (int e : m.values())
            r += e * (e - 1) / 2;

        return r;
    }
}
