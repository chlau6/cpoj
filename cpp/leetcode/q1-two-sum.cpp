#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int size = nums.size();
        unordered_map<int, int> map;

        for (int i = 0; i < size; i++) {
            int diff = target - nums[i];
            if (map.count(diff)) {
                return {map[diff], i};
            }
            map[nums[i]] = i;
        }

        return {-1, -1};
    }
};

int main() {
    Solution s;

    vector<int> nums = {2, 7, 9, 15};
    vector<int> ans = s.twoSum(nums, 9);

    for (int i = 0; i < ans.size(); i++) {
        cout << ans[i] << " ";
    }
    
    return 0;
}