public class Q1221 {
    public int balancedStringSplit(String s) {
        int r = 0, a = 0;

        for (char c : s.toCharArray()) {
            r += c == 'L' ? 1 : -1;

            if (r == 0)
                a++;
        }

        return a;
    }
}
