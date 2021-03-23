public class Q0238 {
    public int[] productExceptSelf(int[] a) {
        int p = 1, z = 0;

        for (int e : a) {
            p *= e == 0 ? 1 : e;
            z += e == 0 ? 1 : 0;
        }

        if (z > 1)
            return new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (z == 0)
                a[i] = p / a[i];
            else
                a[i] = a[i] == 0 ? p : 0;
        }

        return a;
    }
}
