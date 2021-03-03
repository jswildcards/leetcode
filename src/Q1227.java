// Reference: https://leetcode.com/problems/airplane-seat-assignment-probability/discuss/1050685/C%2B%2B-simple-Solution-with-proof-O(1)-time-and-space-complexity.
// Reference: https://medium.com/i-math/solving-an-advanced-probability-problem-with-virtually-no-math-5750707885f1

public class Q1227 {
    public double nthPersonGetsNthSeat(int n) {
        return n == 1 ? 1 : 0.5;
    }
}
