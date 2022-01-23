package question;

public class Q1603 {
    class ParkingSystem {
        int[] parks = new int[4];

        public ParkingSystem(int big, int medium, int small) {
            parks[1] = big;
            parks[2] = medium;
            parks[3] = small;
        }

        public boolean addCar(int carType) {
            return --parks[carType] >= 0;
        }
    }
}

/*
1603. Design Parking System
 */
