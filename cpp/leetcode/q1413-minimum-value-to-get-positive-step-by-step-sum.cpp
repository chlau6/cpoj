#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int minVal = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            minVal = min(minVal, sum);
        }

        return -minVal + 1;
    }
};