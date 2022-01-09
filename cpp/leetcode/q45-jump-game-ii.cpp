#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size() - 1;
        int result = 0;
        int last = 0;
        int curr = 0;

        for (int i = 0; i < n; i++) {
            curr = max(curr, i + nums[i]);

            if (i == last) {
                last = curr;
                result++;
            }

            if (last >= n) {
                break;
            }

        }

        return result;
    }
};