#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int largestPerimeter(vector<int>& nums) {
        int n = nums.size();

        sort(nums.begin(), nums.end());

        for (int i = n - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];

            if (a + b > c && a + c > b && b + c > a) return a + b + c;
        }

        return 0;
    }
};