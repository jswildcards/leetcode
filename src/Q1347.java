import java.util.Arrays;

public class Q1347 {
    public int minSteps(String s, String t) {
        int r = 0;
        int[] a = new int[26];

        for (char c : s.toCharArray())
            a[c - 'a']++;

        for (char c : t.toCharArray())
            a[c - 'a']--;

        for (int e : a)
            r += Math.max(e, 0);

        return r;
    }
}
