// Reference: https://leetcode.com/problems/longest-valid-parentheses/solution/#Approach4

public class Q0032 {
    public int longestValidParentheses(String s) {
        int m = 0, n = s.length();
        int[] p = {0, 0};

        for (int i = 0; i < n; i++) {
            p[s.charAt(i) - '(']++;

            if (p[0] == p[1])
                m = Math.max(m, p[0] * 2);
            else if (p[0] <= p[1])
                p[0] = p[1] = 0;
        }

        p[0] = p[1] = 0;
        for (int i = n - 1; i > -1; i--) {
            p[s.charAt(i) - '(']++;

            if (p[0] == p[1])
                m = Math.max(m, p[0] * 2);
            else if (p[0] >= p[1])
                p[0] = p[1] = 0;
        }

        return m;
    }
}
