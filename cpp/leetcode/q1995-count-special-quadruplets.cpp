#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countQuadruplets(vector<int>& nums) {
        int n = nums.size();
        int result = 0;
        unordered_map<int, int> map;

        for (int b = 1; b < n - 2; b++) {
            for (int a = 0; a < b; a++) {
                map[nums[a] + nums[b]]++;
            }

            for (int d = b + 2; d < n; d++) {
                result += map[nums[d] - nums[b + 1]];
            }
        }

        return result;
    }
};