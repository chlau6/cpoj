#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findRadius(vector<int>& houses, vector<int>& heaters) {
        sort(houses.begin(), houses.end());
        sort(heaters.begin(), heaters.end());

        int result = 0;
        int n = heaters.size();
        int j = 0;

        for (int house : houses) {
            while (j < n - 1 && abs(heaters[j + 1] - house) <= abs(heaters[j] - house)) {
                j++;
            }

            result = max(result, abs(heaters[j] - house));
        }

        return result;
    }
};