import java.util.List;

public class Q0539 {
    public int findMinDifference(List<String> g) {
        int[] p = new int[24 * 60];
        int r = Integer.MAX_VALUE, h = -1, t = -1, n = p.length;

        for (String e : g) {
            int m = (e.charAt(0) - '0') * 10 + e.charAt(1) - '0';
            int s = (e.charAt(3) - '0') * 10 + e.charAt(4) - '0';
            if (p[m * 60 + s]++ > 0)
                return 0;
        }

        for (int i = 0; i < n; i++) {
            if (p[i] > 0) {
                if (h == -1)
                    h = i + n;
                else
                    r = Math.min(r, i - t);

                t = i;
            }
        }

        return Math.min(r, h - t);
    }
}
