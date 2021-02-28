public class Q1769 {
    public int[] minOperations(String s) {
        // s:   "001011"
        // ltr: [0, 0, 0, 1, 2, 4]
        // rtl: [11, 8, 5, 3, 1, 0]

        int[] r = new int[s.length()];
        int c = 0, o = 0;

        for (int i = 0; i < s.length(); i++) {
            r[i] += o;
            c += s.charAt(i) - '0';
            o += c;
        }

        c = o = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            r[i] += o;
            c += s.charAt(i) - '0';
            o += c;
        }

        return r;
    }
}
