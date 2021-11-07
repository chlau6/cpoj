#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        vector<int> result;
        int length = nums.size();

        for (int i = 0; i < length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result.push_back(nums[i + 1]);
            }
        }

        return result;
    }
};