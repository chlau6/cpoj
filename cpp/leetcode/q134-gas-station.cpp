#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int global = 0;
        int local = 0;
        int start = 0;
        int n = gas.size();

        for (int i = 0; i < n; i++) {
            global += gas[i] - cost[i];
            local += gas[i] - cost[i];

            if (local < 0) {
                start = i + 1;
                local = 0;
            }
        }

        return (global < 0) ? - 1 : start;
    }
};