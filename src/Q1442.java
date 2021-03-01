public class Q1442 {
    public int countTriplets(int[] a) {
        int r = 0;

        for (int i = 0; i < a.length; i++) {
            int t = a[i];

            for (int j = i + 1; j < a.length; j++) {
                t ^= a[j];

                if (t == 0)
                    r += j - i;
            }
        }

        return r;
    }
}
