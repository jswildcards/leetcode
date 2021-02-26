public class Q1450 {
    public int busyStudent(int[] s, int[] e, int q) {
        int r = 0;

        for(int i = 0; i < s.length; i++)
            r += s[i] <= q && q <= e[i] ? 1 : 0;

        return r;
    }
}
