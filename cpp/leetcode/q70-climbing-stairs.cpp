#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int climbStairs(int n) {
        if (n <= 2) return n;

        int twoStepBefore = 1;
        int oneStepBefore = 2;

        for (int i = 3; i <= n; i++) {
            int temp = oneStepBefore + twoStepBefore;
            twoStepBefore = oneStepBefore;
            oneStepBefore = temp;
        }

        return oneStepBefore;
    }
};