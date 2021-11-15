#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    double trimMean(vector<int>& arr) {
        sort(arr.begin(), arr.end());

        int n = arr.size();
        int start = n / 20;
        int end = n - start;
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += arr[i];
        }

        return sum * 1.0 / (n - 2 * start);
    }
};