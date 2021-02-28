// First part of the formula calculating total money of full week
// Second part of the formula calculating total money of remaining week

public class Q1716 {
    public int totalMoney(int n) {
        return (28 * (n / 7) + 7 * ((n / 7) * ((n / 7) - 1) / 2)) + ((n % 7) * (n % 7 + 1) / 2 + (n % 7) * (n / 7));
    }
}
