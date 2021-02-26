public class Q1768 {
    public String mergeAlternately(String s, String t) {
        int m = Math.min(s.length(), t.length());
        StringBuilder r = new StringBuilder(s);

        for (int i = 0; i < m; i++)
            r.insert(i * 2 + 1, t.charAt(i));

        if (t.length() > s.length())
            r.append(t.substring(s.length()));

        return r.toString();
    }
}
