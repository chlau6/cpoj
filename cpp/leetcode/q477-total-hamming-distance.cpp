#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int totalHammingDistance(vector<int>& nums) {
        int result = 0;
        int n = nums.size();

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int num : nums) {
                if ((num & (1 << i)) > 0) {
                    count++;
                }
            }

            result += count * (n - count);
        }

        return result;
    }
};