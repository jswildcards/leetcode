public class Q1370 {
    public String sortString(String s) {
        StringBuilder r = new StringBuilder();
        int[] m = new int[26];

        for (char c : s.toCharArray())
            m[c - 'a']++;

        while (r.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (m[i]-- > 0)
                    r.append((char) (i + 'a'));
            }
            for (int i = 25; i > -1; i--) {
                if (m[i]-- > 0)
                    r.append((char) (i + 'a'));
            }
        }

        return r.toString();
    }
}
