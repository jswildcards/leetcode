public class Q1528 {
    public String restoreString(String s, int[] a) {
        char[] m = new char[a.length];

        for (int i = 0; i < a.length; i++)
            m[a[i]] = s.charAt(i);

        return String.valueOf(m);
    }
}
