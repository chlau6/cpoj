#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());

        int i = 0;
        int j = nums.size() - 1;
        int result = 0;

        while (i < j) {
            if (nums[i] + nums[j] == k) {
                result++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
};