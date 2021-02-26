public class Q1704 {
    public boolean halvesAreAlike(String s) {
        int r = 0;
        boolean[] b = new boolean[127];
        b['a'] = b['e'] = b['i'] = b['o'] = b['u'] = true;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (b[s.charAt(i)])
                r += (i < s.length() / 2 ? 1 : -1);
        }

        return r == 0;
    }
}
