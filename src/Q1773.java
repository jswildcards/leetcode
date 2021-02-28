import java.util.List;

public class Q1773 {
    public int countMatches(List<List<String>> a, String k, String v) {
        int r = 0, i = k.equals("type") ? 0 : (k.equals("color") ? 1 : 2);

        for (List<String> e : a) {
            if (e.get(i).equals(v))
                r++;
        }

        return r;
    }
}
