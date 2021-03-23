import java.util.Arrays;

public class Q0976 {
    public int largestPerimeter(int[] a) {
        Arrays.sort(a);

        for (int i = a.length - 1; i > 1; i--) {
            if (a[i - 2] + a[i - 1] > a[i])
                return a[i - 2] + a[i - 1] + a[i];
        }

        return 0;
    }
}
