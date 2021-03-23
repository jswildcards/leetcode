public class Q1529 {
    public int minFlips(String s) {
        int r = 0, p = '0';

        for (char c : s.toCharArray()) {
            r += Math.abs(c - p);
            p = c;
        }

        return r;
    }
}
