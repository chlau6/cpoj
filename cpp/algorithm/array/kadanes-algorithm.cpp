#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int kadanesAlgorithm(vector<int>& nums) {
        int best = 0, sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum = max(nums[i], sum + nums[i]);
            best = max(best, sum);
        }

        return best;
    }
};

int main() {
    vector<int> nums = {-1, 2, 4, -3, 5, 2, -5, 2};

    Solution s;
    cout << s.kadanesAlgorithm(nums);
}