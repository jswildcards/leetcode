public class Q1678 {
    public String interpret(String s) {
        char l = '\0';
        StringBuilder r = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(c == 'G')
                r.append('G');
            else if(c == ')')
                r.append(l == '(' ? 'o' : "al");

            l = c;
        }

        return r.toString();
    }
}
