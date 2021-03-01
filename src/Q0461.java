public class Q0461 {
    public int hammingDistance(int x, int y) {
        int r = 0, z = x ^ y;

        while(z > 0) {
            r += z & 1;
            z >>= 1;
        }

        return r;
    }
}
