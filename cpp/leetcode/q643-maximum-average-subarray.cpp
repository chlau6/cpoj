#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int length = nums.size();
        int maxSum = INT_MIN;
        int sum = 0;

        for (int i = 0; i < length ; i++) {
            sum += nums[i];

            if (i + 1 >= k) {
                maxSum = max(maxSum, sum);
                sum -= nums[i - k + 1];
            }
        }

        return maxSum * 1.0 / k;
    }
};