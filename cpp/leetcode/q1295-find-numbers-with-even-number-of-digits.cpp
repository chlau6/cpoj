#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int result = 0;

        for (int num : nums) {
            if (num >= 10 && num <= 99 || num >= 1000 && num <= 9999 || num == 100000) {
                result++;
            }
        }

        return result;
    }
};