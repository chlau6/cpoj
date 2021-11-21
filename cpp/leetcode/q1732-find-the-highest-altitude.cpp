#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int altitude = 0;
        int result = 0;

        for (int g : gain) {
            altitude += g;
            result = max(result, altitude);
        }

        return result;
    }
};