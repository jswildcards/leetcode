public class Q1603 {
    class ParkingSystem {
        int[] p;

        public ParkingSystem(int l, int m, int s) {
            p = new int[]{0, l, m, s};
        }

        public boolean addCar(int t) {
            return p[t]-- > 0;
        }
    }
}
