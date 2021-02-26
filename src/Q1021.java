public class Q1021 {
    public String removeOuterParentheses(String s) {
        int t = 0;
        StringBuilder r = new StringBuilder();

        for (char c : s.toCharArray()) {
            t += c == '(' ? 1 : -1;

            if(t > (c == '(' ? 1 : 0))
                r.append(c);
        }

        return r.toString();
    }
}
