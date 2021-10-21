#include<bits/stdc++.h>

using namespace std;

class NumArray {
public:
    vector<int> v;

    NumArray(vector<int>& nums) {
        v.resize(nums.size() + 1, 0);

        for (int i = 0; i < nums.size(); i++) {
            v[i + 1] = v[i] + nums[i];
        }
    }

    int sumRange(int left, int right) {
        return v[right + 1] - v[left];
    }
};