import java.util.Arrays;

public class Q1460 {
    public boolean canBeEqual(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
