// Reference: https://leetcode.com/problems/binary-number-with-alternating-bits/solution/
//      10101   (n)
// +     1010   (n >> 1)
// ----------
//      11111   (t)
// &   100000   (t + 1)
// ----------
//          0

public class Q0693 {
    public boolean hasAlternatingBits(int n) {
        int t = n + (n >> 1);
        return ((t + 1) & t) == 0;
    }
}
