public class Q1662 {
    public boolean arrayStringsAreEqual(String[] s, String[] t) {
        return String.join("", s).equals(String.join("", t));
    }
}
