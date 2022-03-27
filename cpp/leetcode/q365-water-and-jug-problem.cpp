#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (jug1Capacity + jug2Capacity < targetCapacity) return false;

        int hcf = gcd(jug1Capacity, jug2Capacity);

        return targetCapacity % hcf == 0;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
};