public class Q0922 {
    public int[] sortArrayByParityII(int[] a) {
        int j = 1;

        for (int i = 0; i < a.length; i += 2) {
            if (a[i] % 2 == 1) {
                while (a[j] % 2 == 1)
                    j += 2;

                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }

        return a;
    }
}
