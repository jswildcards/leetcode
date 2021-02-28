public class Q0392 {
    public boolean isSubsequence(String s, String t) {
        int r = 0;

        for (char c : t.toCharArray()) {
            if(r < s.length() && c == s.charAt(r))
                r++;
        }

        return r >= s.length();
    }
}
