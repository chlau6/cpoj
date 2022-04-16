#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minMoves(vector<int>& nums) {
        int result = 0;
        int minimum = INT_MAX;

        for (int num : nums) {
            minimum = min(minimum, num);
        }

        for (int num : nums) {
            result += (num - minimum);
        }

        return result;
    }
};