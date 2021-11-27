#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int result = 0;
        int minVal = INT_MAX;

        for (int num : nums) {
            minVal = min(minVal, num);
            result = max(result, num - minVal);
        }

        return result == 0 ? -1 : result;
    }
};