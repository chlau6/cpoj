#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<bool> prefixesDivBy5(vector<int>& nums) {
        int sum = 0;
        vector<boolean> result;

        for (int num : nums) {
            sum = ((sum << 1) + num) % 5;
            result.push_back(sum == 0);
        }

        return result;
    }
};