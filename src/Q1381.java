public class Q1381 {
    class CustomStack {
        int[] s;
        int l;

        public CustomStack(int m) {
            s = new int[m];
            l = 0;
        }

        public void push(int x) {
            if (l < s.length)
                s[l++] = x;
        }

        public int pop() {
            if (l < 1)
                return -1;

            return s[--l];
        }

        public void increment(int k, int v) {
            k = Math.min(k, l);
            for (int i = 0; i < k; i++)
                s[i] += v;
        }
    }
}
