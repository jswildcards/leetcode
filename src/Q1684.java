public class Q1684 {
    public int countConsistentStrings(String s, String[] a) {
        int r = a.length;
        boolean[] m = new boolean[26];

        for (char c : s.toCharArray())
            m[c - 'a'] = true;

        for (String t : a) {
            for (char c : t.toCharArray()) {
                if (!m[c - 'a']) {
                    r--;
                    break;
                }
            }
        }

        return r;
    }
}
