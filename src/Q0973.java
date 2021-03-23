import java.util.Arrays;

public class Q0973 {
    class Point implements Comparable {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Object o) {
            Point p = (Point) o;
            return x * x + y * y - (p.x * p.x + p.y * p.y);
        }
    }

    public int[][] kClosest(int[][] c, int k) {
        int[][] r = new int[k][2];
        Point[] p = new Point[c.length];

        for (int i = 0; i < p.length; i++)
            p[i] = new Point(c[i][0], c[i][1]);

        p = Arrays.stream(p).sorted().toArray(Point[]::new);

        for (int i = 0; i < k; i++)
            r[i] = new int[]{p[i].x, p[i].y};

        return r;
    }
}
