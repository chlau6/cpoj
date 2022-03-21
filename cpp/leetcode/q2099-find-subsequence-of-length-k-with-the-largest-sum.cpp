#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> maxSubsequence(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> map(n);
        vector<int> result(k);

        for (int i = 0; i < n; i++) {
            map[i] = i;
        }

        sort(map.begin(), map.end(), [&](int a, int b) {
            return nums[a] > nums[b];
        });

        map.resize(k);
        sort(map.begin(), map.end());

        for (int i = 0; i < k; i++) {
            result[i] = nums[map[i]];
        }

        return result;
    }
};