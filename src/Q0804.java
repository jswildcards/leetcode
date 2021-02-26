import java.util.HashSet;
import java.util.Set;

public class Q0804 {
    public int uniqueMorseRepresentations(String[] a) {
        Set<String> s = new HashSet<>();
        String[] m = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        for (String t : a) {
            StringBuilder r = new StringBuilder();

            for (char c : t.toCharArray())
                r.append(m[c - 'a']);

            s.add(r.toString());
        }

        return s.size();
    }
}
