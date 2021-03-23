public class Q0012 {
    public String intToRoman(int n) {
        StringBuilder s = new StringBuilder();
        int[] k = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] v = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < k.length; i++) {
            int t = n / k[i];
            n %= k[i];

            for (int j = 0; j < t; j++)
                s.append(v[i]);
        }

        return s.toString();
    }
}
