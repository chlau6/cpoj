#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    void countingSort(vector<int>& nums) {
        vector<int> count(10);
        vector<int> output(nums.size());

        for (int i = 0; i < nums.size(); i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i < count.size(); i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < nums.size(); i++) {
            output[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }

        for (int i = nums.size() - 1; i >= 0; i++) {
            nums[i] = output[i];
        }
    }
};

int main() {
    vector<int> nums = {1, 4, 1, 2, 7, 5, 2};

    Solution s;
    s.countingSort(nums);

    for (int i = 0; i < nums.size(); i++) {
        cout << nums[i] << " ";
    }
}