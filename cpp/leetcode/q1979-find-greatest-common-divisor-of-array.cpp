#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findGCD(vector<int>& nums) {
        int maxVal = INT_MIN;
        int minVal = INT_MAX;

        for (int num : nums) {
            maxVal = max(maxVal, num);
            minVal = min(minVal, num);
        }

        return gcd(maxVal, minVal);
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
};