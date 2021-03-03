public class Q0003 {
    public int lengthOfLongestSubstring(String s) {
        int r = 0, i = 0, j = 0;
        Integer[] m = new Integer[128];

        for (; j < s.length(); j++) {
            int c = s.charAt(j);

            if (m[c] != null && i <= m[c]) {
                r = Math.max(r, j - i);
                i = m[c] + 1;
            }

            m[c] = j;
        }

        return Math.max(r, j - i);
    }
}
