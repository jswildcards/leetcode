import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Q0720 {
    public String longestWord(String[] a) {
        String r = "";
        Set<String> m = new TreeSet<>();

        m.add("");
        Arrays.sort(a);

        for (String s : a) {
            if (m.contains(s.substring(0, s.length() - 1))) {
                if (s.length() > r.length())
                    r = s;
                m.add(s);
            }
        }

        return r;
    }
}
