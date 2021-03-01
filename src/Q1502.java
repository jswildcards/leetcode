import java.util.Arrays;

public class Q1502 {
    public boolean canMakeArithmeticProgression(int[] a) {
        Arrays.sort(a);
        int d = a[1] - a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] - a[i - 1] != d)
                return false;
        }

        return true;
    }
}
