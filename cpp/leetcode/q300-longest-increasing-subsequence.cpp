#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        vector<int> dp;

        for (int num : nums) {
            int left = 0;
            int right = dp.size();

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (dp[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (right == dp.size()) {
                dp.push_back(num);
            } else {
                dp[right] = num;
            }
        }

        return dp.size();
    }
};