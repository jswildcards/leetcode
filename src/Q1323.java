public class Q1323 {
    public int maximum69Number(int n) {
        return Integer.parseInt(
                String.valueOf(n).replaceFirst("6", "9")
        );
    }
}
