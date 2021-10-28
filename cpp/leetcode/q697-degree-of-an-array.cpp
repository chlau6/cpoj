#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        int degree = 0;
        int result = 0;
        unordered_map<int, int> count, startIndex;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            ++count[nums[i]];

            if (!startIndex.count(nums[i])) startIndex[nums[i]] = i;

            int c = count[nums[i]];

            if (c > degree) {
                degree = c;
                result = i - startIndex[nums[i]] + 1;
            } else if (c == degree) {
                result = min(result, i - startIndex[nums[i]] + 1);
            }
        }

        return result;
    }
};