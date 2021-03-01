// Boyer-Moore Voting Algorithm is an interesting algorithm solving this problem.
// Reference: https://leetcode.com/problems/majority-element/solution/#Approach6

import java.util.HashMap;
import java.util.Map;

public class Q0169 {
    public int majorityElement(int[] a) {
        Map<Integer, Integer> m = new HashMap<>();
        int r = 0, c = 0;

        for (int e : a)
            m.put(e, m.getOrDefault(e, 0) + 1);

        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() > c) {
                c = e.getValue();
                r = e.getKey();
            }
        }

        return r;
    }
}
