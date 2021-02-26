public class Q0771 {
    public int numJewelsInStones(String s, String t) {
        int r = 0;

        for (char c : t.toCharArray()) {
            if (s.indexOf(c) != -1)
                r++;
        }

        return r;
    }
}
