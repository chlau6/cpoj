#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> s;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            int start = nums[i];

            while (i + 1 < length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (nums[i] == start) {
                s.push_back(to_string(start));
            } else {
                s.push_back(to_string(start) + "->" + to_string(nums[i]));
            }
        }

        return s;
    }
};