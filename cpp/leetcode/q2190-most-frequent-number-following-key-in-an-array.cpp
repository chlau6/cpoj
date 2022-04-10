#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int mostFrequent(vector<int>& nums, int key) {
        vector<int> count(1001);
        int n = nums.size();
        int result = 0;

        for (int i = 0; i <= n - 2; i++) {
            if (nums[i] == key && ++count[nums[i + 1]] > count[result]) {
                result = nums[i + 1];
            }
        }

        return result;
    }
};