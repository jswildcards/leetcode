public class Q1641 {
    public int countVowelStrings(int n) {
        int[] r = {1, 1, 1, 1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = r.length - 2; j > -1; j--)
                r[j] += r[j + 1];
        }

        return r[0];
    }
}
