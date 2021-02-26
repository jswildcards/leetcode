import java.util.LinkedList;
import java.util.List;

public class Q0728 {
    public List<Integer> selfDividingNumbers(int l, int r) {
        List<Integer> p = new LinkedList<>();

        for (int i = l; i <= r; i++) {
            int t = i, q, f = 1;

            while (t > 0 && f == 1) {
                q = t % 10;
                t /= 10;

                if (q == 0 || i % q != 0)
                    f = 0;
            }

            if (f == 1)
                p.add(i);
        }

        return p;
    }
}
