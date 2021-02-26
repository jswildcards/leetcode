import java.util.Stack;

public class Q1475 {
    public int[] finalPrices(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] >= a[j]) {
                    a[i] -= a[j];
                    break;
                }
            }
        }

        return a;
    }
}
