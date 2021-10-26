#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int thirdMax(vector<int>& nums) {
        long firstMax = LONG_MIN;
        long secondMax = LONG_MIN;
        long thirdMax = LONG_MIN;

        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num < secondMax) {
                thirdMax = num;
            }
        }

        return thirdMax == LONG_MIN || thirdMax == secondMax ? firstMax : thirdMax;
    }
};