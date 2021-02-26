public class Q1342 {
    public int numberOfSteps(int n) {
        return n == 0 ? 0 : (int) (Math.log(n) / Math.log(2)) + Integer.bitCount(n);
    }
}
