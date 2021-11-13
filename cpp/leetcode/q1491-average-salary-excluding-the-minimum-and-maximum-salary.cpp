#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    double average(vector<int>& salary) {
        int maxSalary = INT_MIN;
        int minSalary = INT_MAX;
        int sum = 0;

        for (int s : salary) {
            maxSalary = max(maxSalary, s);
            minSalary = min(minSalary, s);
            sum += s;
        }

        return (sum - maxSalary - minSalary) / (salary.size() - 2.0);
    }
};