public class Q0944 {
    public int minDeletionSize(String[] a) {
        int r = 0;

        for (int i = 0; i < a[0].length(); i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j].charAt(i) < a[j - 1].charAt(i)) {
                    r++;
                    break;
                }
            }
        }

        return r;
    }
}
