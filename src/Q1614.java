public class Q1614 {
    public int maxDepth(String s) {
        int r = 0, m = 0;

        for (char c : s.toCharArray()) {
            if (c == '(')
                m = Math.max(m, ++r);

            if (c == ')')
                r--;
        }

        return m;
    }
}
