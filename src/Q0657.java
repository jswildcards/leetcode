public class Q0657 {
    public boolean judgeCircle(String s) {
        int[] r = new int[128];

        for (char c : s.toCharArray())
            r[c]++;

        return r['D'] == r['U'] && r['L'] == r['R'];
    }
}
