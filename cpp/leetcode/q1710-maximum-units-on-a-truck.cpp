#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maximumUnits(vector<vector<int>>& boxTypes, int truckSize) {
        int result = 0;

        sort(boxTypes.begin(), boxTypes.end(), [](auto a, auto b) {
            return a[1] > b[1];
        });

        for (auto boxType : boxTypes) {
            int box = min(truckSize, boxType[0]);
            result += box * boxType[1];
            truckSize -= box;

            if (truckSize == 0) break;
        }

        return result;
    }
};