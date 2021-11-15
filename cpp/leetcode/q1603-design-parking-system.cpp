#include<bits/stdc++.h>

using namespace std;

class ParkingSystem {
public:
    vector<int> parks;

    ParkingSystem(int big, int medium, int small) {
        parks.resize(4);

        parks[1] = big;
        parks[2] = medium;
        parks[3] = small;
    }

    bool addCar(int carType) {
        return --parks[carType] >= 0;
    }
};