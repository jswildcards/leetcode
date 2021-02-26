// TODO: binary search optimization
// Reference: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/discuss/1081907/Simplest-Binary-Search-Solution-O(log(n)

public class Q1351 {
    public int countNegatives(int[][] g) {
        int r = 0, c = g[0].length;

        for (int[] p : g) {
            for (int i = 0; i < c; i++) {
                if (p[i] < 0) {
                    c = i;
                    break;
                }
            }

            r += c >= p.length ? 0 : p.length - c;
        }

        return r;
    }
}
