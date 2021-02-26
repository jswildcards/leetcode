// Reference: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/discuss/882347/Java-O(n)-time-and-O(1)-space-solution-or-Math

public class Q1588 {
    public int sumOddLengthSubarrays(int[] a) {
        int r = 0, n = a.length;

        for (int i = 0; i < n; i++)
            r += ((i + 1) * (n - i) + 1) / 2 * a[i];

        return r;
    }
}
