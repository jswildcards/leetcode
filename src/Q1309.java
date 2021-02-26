public class Q1309 {
    public String freqAlphabets(String s) {
        StringBuilder r = new StringBuilder();

        for (int i = s.length() - 1; i > -1; i--) {
            int c = s.charAt(i) - '1';

            if (s.charAt(i) == '#')
                c = Integer.parseInt(s.substring(i -= 2, i + 2)) - 1;

            r.insert(0, Character.toString('a' + c));
        }

        return r.toString();
    }
}
