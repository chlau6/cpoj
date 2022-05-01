#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> intersection(vector<vector<int>>& nums) {
        int n = nums.size();
        vector<int> count(1001);
        vector<int> result;

        for (auto& array : nums) {
            for (int num : array) {
                if (++count[num] == n) {
                    result.push_back(num);
                }
            }
        }

        sort(result.begin(), result.end());

        return result;
    }
};