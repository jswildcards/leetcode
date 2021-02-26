public class Q1374 {
    public String generateTheString(int n) {
        StringBuilder r = new StringBuilder();

        for (int i = 0; i < n - 1; i++)
            r.append('a');

        return r.append(n % 2 == 0 ? 'b' : 'a').toString();
    }
}
