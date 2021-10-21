#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int count = 0;
        int major = 0;

        for (int num : nums) {
            if (count == 0) {
                count = 1;
                major = num;
            } else {
                major == num ? count++ : count--;
            }
        }

        return major;
    }
};