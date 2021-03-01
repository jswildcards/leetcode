public class Q0476 {
    public int findComplement(int n) {
        return Integer.highestOneBit(n) * 2 - 1 ^ n;
    }
}
