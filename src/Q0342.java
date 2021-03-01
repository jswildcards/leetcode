public class Q0342 {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (Integer.bitCount(n - 1) & 1) == 0;
    }
}
