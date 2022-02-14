#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string largestNumber(vector<int>& nums) {
        int n = nums.size();
        string result;

        sort(nums.begin(), nums.end(), [](int a, int b) {
            return to_string(a) + to_string(b) > to_string(b) + to_string(a);
        });

        for (int num : nums) {
            result += to_string(num);
        }

        return result[0] == '0' ? "0" : result;
    }
};
