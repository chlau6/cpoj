#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> targetIndices(vector<int>& nums, int target) {
        vector<int> result;

        int count = 0;
        int start = 0;

        for (int num : nums) {
            if (num == target) {
                count++;
            } else if (num < target) {
                start++;
            }
        }

        while (--count >= 0) {
            result.push_back(start++);
        }

        return result;
    }
};