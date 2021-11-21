#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        vector<int> count(101);

        for (int num : nums) {
            count[num]++;
        }

        int result = 0;

        for (int i = 1; i <= 100; i++) {
            if (count[i] == 1) {
                result += i;
            }
        }

        return result;
    }
};