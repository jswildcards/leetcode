public class Q0303 {
    class NumArray {
        int[] r;

        public NumArray(int[] a) {
            r = new int[a.length + 1];

            for (int i = 0; i < a.length; i++)
                r[i + 1] = a[i] + r[i];
        }

        public int sumRange(int i, int j) {
            return r[j + 1] - r[i];
        }
    }
}
