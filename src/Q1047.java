public class Q1047 {
    public String removeDuplicates(String s) {
        char[] r = new char[s.length()];
        int i = 0;

        for (char c : s.toCharArray()) {
            if(i > 0 && r[i - 1] == c)
                i--;
            else
                r[i++] = c;
        }

        return new String(r, 0, i);
    }
}
